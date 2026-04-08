/**
 * 이미 만들어진 Exception을 이용해서
 * 개발자가 추가하고 싶은 메세지나 동작만 추가하고
 * 나머지는 기존에 천재적인 자바 개발자들이 만들어놓은
 * RuntimeException 기능들을 모두 사용하겠다.
 *
 * RuntimeException = 자바에서 잘 만들놓은 class 문서 파일 이기 때문에
 * 클래스 문서 파일을 사용하겠다. extends 상속 사용
 * extends = 범위를 넓힌다.
 * 내가 작성한 class 이외에도 다른 기능을 사용할 수 있도록 다른 클래스 기능까지 사용하겠다.
 */
public class 잔액없음Exception extends  RuntimeException {
    public 잔액없음Exception(int 잔액) {
        super("잔액 부족! 현재 잔액 : " + 잔액 + "원");
    }
}
