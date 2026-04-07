import java.util.Scanner;
/*
try - catch = 개발자가 터트리는 예외상황이 아니라 개발자는 생각도 없었는데 발생하는 상황에
                             대하여 대비를 작성하는 것
throw new = 개발자가 클라이언트가 작성하거나 행동하는 범위가 개발자가 생각하는 범위를 벗어나
                             마음에 들지 않아 개발자가 끼어들어 제제를 가하는 상황
 */
public class RPG전투 {
    public void 전투게임() {
        Scanner sc = new Scanner(System.in);
        int 보스체력 = 100, 내체력 = 50;

        while (보스체력 > 0 && 내체력 > 0) {
            System.out.print("공격력 : ");
            try {
                int 공격 = Integer.parseInt(sc.nextLine());
                if (공격 <= 0 || 공격 > 99) throw new IllegalArgumentException("!~99 사이만 입력 가능합니다.");
                보스체력 -= 공격;
                내체력 -= (int) (Math.random() * 20) + 1;
                System.out.println("보스체력 : " + Math.max(보스체력, 0) + "내체력 : " + Math.max(내체력, 0));
            } catch (NumberFormatException e) {
                System.out.print("❌❌❌숫자만 !!!❌❌❌");
                내체력 -= 10;
            } catch (Exception e) {
                System.out.print("개발자가 미처 체크하지 못한 에러 발견 Todo 업무 해결할 것!!" + e.getMessage());
            } finally {
                System.out.println("턴 종료");
            }
        }
        System.out.println(보스체력 <= 0 ? "승리!!" : "게임오버");
    }
}
