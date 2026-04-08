package thrownew;

public class 은행계좌동작 {
    public static void main(String[] args) {
        은행Throw a군 = new 은행Throw();
        try {
            a군.송금하기(3000);
            a군.송금하기(50000); // 잔액없음Exception + IllegalArgumentException 함께 보유하고 있는 상황
        } catch (잔액없음Exception e) { // 보통 우리가 맨 위에 개발자가 만든 잔액없음Exception을
            // 최상위로 두는 것이 바람직하다.
            System.out.println("송금불가 : " + e.getMessage());
        } catch (IllegalArgumentException e) {
            // 자바에서 만든 IllegalArgumentException 의 경우에는
            // 개발자가 만들어놓은 잔액없음Exception + IllegalArgumentException
            // 해서 모든 에러를 확인할 수 있다.
        }
    }
}
