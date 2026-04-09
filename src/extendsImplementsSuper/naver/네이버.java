package extendsImplementsSuper.naver;

public class 네이버 {
    private String 아이디;
    private String 닉네임;

    public 네이버() {
    }

    public 네이버(String 아이디, String 닉네임) {
        this.아이디 = 아이디;
        this.닉네임 = 닉네임;
    }

    public void 로그인() {
        System.out.println(닉네임 + "님 네이버 로그인!");
    }

    public void 정보출력() {
        System.out.println("아이디 : " + 아이디 + " / 닉네임 : " + 닉네임);
    }
}
