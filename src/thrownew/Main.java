package thrownew;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        계산기 a = new 계산기();
        try {
            a.나누기(10, 2);   // 성공
            a.나누기(10, 0);   // 예외 발생
        } catch (나누기Exception e) {
            System.out.println("오류 : " + e.getMessage());
        } catch (ArithmeticException e) { // ArithmeticException: / by zero
            System.out.println("오류 : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("오류 : " + e.getMessage());
        }
    }
}
