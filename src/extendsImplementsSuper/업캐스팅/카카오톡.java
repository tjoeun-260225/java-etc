package extendsImplementsSuper.업캐스팅;

public class 카카오톡 extends 카카오서비스{
    public String 이름;
    @Override
    public void 실행() {
       System.out.println("카카오톡 - 채팅방 열렸습니다.");
    }

    public void 로그인(){
        System.out.println("카카오톡 로그인이 되었습니다.");
    }
}