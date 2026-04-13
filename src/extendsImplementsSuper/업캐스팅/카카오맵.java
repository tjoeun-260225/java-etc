package extendsImplementsSuper.업캐스팅;

public class 카카오맵 extends 카카오서비스{
    public String 이름;
    @Override
    public void 실행() {
       System.out.println("카카오맵 - 지도가 열렸습니다.");
    }

    public void 지도(){
        System.out.println("지도가 열렸습니다.");
    }
}