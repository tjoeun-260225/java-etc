package extendsImplementsSuper.naver;

public class 카페 {
    private String 아이디;
    private String 닉네임;
    private String 카페이름;
    private int 회원수;
    public 카페() {}
    public 카페(String 아이디, String 닉네임, String 카페이름, int 회원수) {
        this.아이디 = 아이디;
        this.닉네임 = 닉네임;
        this.카페이름 = 카페이름;
        this.회원수 = 회원수;
    }
    public void 로그인() {
        System.out.println(닉네임 + "님 네이버 로그인!");
    }
    public void 정보출력() {
        System.out.println("아이디 : " + 아이디 + " / 닉네임 : " + 닉네임);
        System.out.println("가입카페: " + 카페이름);
        System.out.println("회원수: " + 회원수 + "명" );
    }
}
