package thrownew;
/**
 * ### Todo
 * - [ ]  `계산기` 클래스를 만들고 `나누기(int 숫자, int 나눌숫자)` 메서드를 작성한다
 * - [ ]  나눌숫자가 0이면 `throw new 나누기Exception` 을 던진다
 * - [ ]  `Main` 에서 `try-catch` 로 예외를 잡아 출력한다
 */
public class 계산기 {
    public int 나누기(int 숫자, int 나눌숫자) {
        if (나눌숫자 == 0) throw new 나누기Exception();
        return 숫자 / 나눌숫자;
    }
}