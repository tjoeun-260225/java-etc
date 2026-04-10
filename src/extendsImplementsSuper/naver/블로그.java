package extendsImplementsSuper.naver;

public class 블로그 extends 네이버 {
    private int 포스트수, 이웃수;
    public 블로그() {}
    public 블로그(String 아이디, String 닉네임, int 포스트수, int 이웃수) {
        super(아이디, 닉네임);
        // 굳이 포스트수와 ABCDEFG 똑같지 작성하지 않아도 된다.
        this.포스트수 = 포스트수;
        this.이웃수 = 이웃수;
    }
    @Override
    public void 정보출력() {
        super.정보출력();
        System.out.println("블로그 포스트 : " + 포스트수 + "개" );
        System.out.println("블로그 이  웃 : " + 이웃수 + "명" );
    }
}
