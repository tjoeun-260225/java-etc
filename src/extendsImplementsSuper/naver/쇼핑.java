package extendsImplementsSuper.naver;

public class 쇼핑  extends 네이버 {
    private int 포인트, 구매횟수;
    public 쇼핑() {}
    public 쇼핑(String 아이디, String 닉네임, int 포인트, int 구매횟수) {
        super(아이디, 닉네임);
        this.포인트 = 포인트;
        this.구매횟수 = 구매횟수;
    }

}
