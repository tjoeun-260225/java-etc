package extendsImplementsSuper.naver;

public class XXX다음 {
    private String 아이디;
    private String 닉네임;
    public XXX다음() {}
    public XXX다음(String 아이디, String 닉네임) {
        this.아이디 = 아이디;
        this.닉네임 = 닉네임;
    }
    public void 로그인() {
        System.out.println(닉네임 + "님 다음 로그인!");
    }
    public void 정보출력() {
        System.out.println("아이디 : " + 아이디 + " / 닉네임 : " + 닉네임);
    }
}

