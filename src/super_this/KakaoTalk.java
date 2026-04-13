package super_this;

public class KakaoTalk extends KakaoService {
    public String chatRoomName;

    KakaoTalk(String chatRoomName) {
        super("카카오톡");  // super() 는 반드시 맨 첫 줄 존재 우선 확장에서 존재하는 생성자부터 작성해.
        this.chatRoomName = chatRoomName;
        // this.chatRoomName = KakaoTalk 에 존재하는 chatRoomName 과
        // String chatRoomName 으로 데이터를 가져오는 매개변수를 구분하기 위한 수단
    }

    KakaoTalk(){
        this("오픈채팅"); // 6번째 줄에 작성한 KakaoTalk(String chatRoomName) 를 사용한다.
    }

    void sendMessage(){
        super.login(); // KakaoService에 있는 login을 사용하겠다.
        System.out.println(chatRoomName + "에 메세지 전송");
    }
}
