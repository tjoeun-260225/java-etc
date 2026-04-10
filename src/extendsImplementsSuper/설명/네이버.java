package extendsImplementsSuper.설명;

// 필드이름과 데이터를 저장하는 생성자 내 매개변수는 명칭이 동일하다는 전제하에 @ 어노테이션 생성
// @Setter @Getter @NoArgsConstructor = 매개변수와 필드이름이 동일하다는 전체하
public class 네이버 {
    // 계정 기본 정보
    private String 아이디;
    private String 비밀번호;
    private String 이름;
    private String 이메일;
    private String 휴대폰번호;
    private String 생년월일;
    private String 성별;            // 남 / 여
    private String 가입일;
    private String 마지막로그인일;
    private boolean 로그인중;

    // 보안
    private boolean 이중인증여부;
    private String 보안질문;
    private String 보안답변;

    // 계정 상태
    private boolean 계정활성화;
    private int 로그인실패횟수;
    private boolean 계정잠금;

    // 프로필
    private String 프로필사진URL;
    private String 상태메시지;


    public void 로그인(String 아이디, String 비밀번호) {
        if (계정잠금) {
            System.out.println("계정이 잠겨있습니다. 고객센터에 문의하세요.");
            return;
        }
        if (this.아이디.equals(아이디) && this.비밀번호.equals(비밀번호)) {
            this.로그인중 = true;
            this.로그인실패횟수 = 0;
            this.마지막로그인일 = "2025-04-09";
            System.out.println(이름 + "님 로그인 성공!");
        } else {
            this.로그인실패횟수++;
            System.out.println("로그인 실패 (" + 로그인실패횟수 + "/5)");
            if (로그인실패횟수 >= 5) {
                this.계정잠금 = true;
                System.out.println("로그인 5회 실패 - 계정이 잠겼습니다.");
            }
        }
    }

    public void 로그아웃() {
        this.로그인중 = false;
        System.out.println(이름 + "님 로그아웃 되었습니다.");
    }

    public void 비밀번호변경(String 기존비밀번호, String 새비밀번호) {
        if (this.비밀번호.equals(기존비밀번호)) {
            this.비밀번호 = 새비밀번호;
            System.out.println("비밀번호가 변경되었습니다.");
        } else {
            System.out.println("기존 비밀번호가 틀렸습니다.");
        }
    }

    public void 이중인증설정(boolean 여부) {
        this.이중인증여부 = 여부;
        System.out.println("이중인증 " + (여부 ? "ON" : "OFF"));
    }

    public void 프로필사진변경(String URL) {
        this.프로필사진URL = URL;
        System.out.println("프로필 사진이 변경되었습니다.");
    }

    public void 상태메시지변경(String 메시지) {
        this.상태메시지 = 메시지;
        System.out.println("상태메시지 : " + 메시지);
    }

    public void 정보출력() {
        System.out.println("=== 네이버 계정 정보 ===");
        System.out.println("아이디        : " + 아이디);
        System.out.println("이름          : " + 이름);
        System.out.println("이메일        : " + 이메일);
        System.out.println("휴대폰        : " + 휴대폰번호);
        System.out.println("생년월일      : " + 생년월일);
        System.out.println("성별          : " + 성별);
        System.out.println("가입일        : " + 가입일);
        System.out.println("마지막로그인  : " + 마지막로그인일);
        System.out.println("상태메시지    : " + 상태메시지);
        System.out.println("이중인증      : " + (이중인증여부 ? "ON" : "OFF"));
        System.out.println("계정상태      : " + (계정잠금 ? "잠금" : "정상"));
    }
}