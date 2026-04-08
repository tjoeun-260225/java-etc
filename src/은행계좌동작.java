public class 은행계좌동작 {
    public static void main(String[] args) {
        은행Throw a군 = new 은행Throw();
        try {
            a군.송금하기(3000);
            a군.송금하기(50000);
        } catch (잔액없음Exception e) {
            System.out.println("송금불가 : " + e.getMessage());
        }
    }
}
