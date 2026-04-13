package extendsImplementsSuper.업캐스팅;

public class 카카오페이 extends 카카오서비스{
    public String 이름;
    @Override
    public void 실행() {
       System.out.println("카카오페이 - 결제 페이지가 열렸습니다.");
    }

    public void 결제(){
        System.out.println("결제가 완료 되었습니다.");
    }
}