package super_this;

public class KakaoService {
    public String serviceName;

    public KakaoService(String name) {
        this.serviceName = name;
        // 현재 KakaoService class 에서 만들어 놓은 필드 이름에서 추후 name으로 가져올 데이터를 저장하겠다.
    }



    public void login(){
        System.out.println(serviceName + " 로그인");
    }
}
