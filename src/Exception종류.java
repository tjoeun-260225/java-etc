/**
 * Throwable : 모든예외의 최상위
 *  Error    : 복구 불가능한 심각한 오류 -> 회사문을 닫아야 할 수 도 있을만큼 매우매우 심각!!!!
 *      OutOfMemoryError : 회사 컴퓨터 메모리 꽉차서 프로젝트 자체가 진행이 안 될 때 -> 전원 강제 종료 후 다시 실행
 *      VirtualMachineError : JVM 오류 자바 가상환경 오류 -> 환경적으로 발생한 문제이므로 프로젝트 자체 동작하지 못하여 코드로 해결할 수 없는상황
 *
 *  Exception
 *      Checked Exception : 외부 환경 탓 (파일 없음, DB 연결 실패) -> 개발자가 미리 대비해야 함
 *                          회사들이 이미 대비를 해놓았고, 아~ 있구나 보면 된다.
 *      Runtime Exception : 클라이언트 탓(잘못된 값 입력) -> 개발자가 강제로 막을 수 없을 때 소비자에게 제대로 회사 프로세스대로 해라
 *
 *  Exception : 프로젝트를 운영하면서 코드로 처리 가능한 예외 상황
 *              모든 예외를 가지고 있는 최상위 예외 / 만약 catch를 한 개만 작성하고 싶다면 Exception만 작성해도 된다.
 *              하지만 각 이슈사항에 하나하나 대응하지 않으므로, 소비자가 불편함 느낄수 는 있다.
 *
 *      Checked Exception : 반드시 개발자가 처리를 해야하는 컴파일 오류
 *          IOException    : 파일 입출력 파일주고받거나 생성하거나 수정 삭제할 때 발생하는 모든 예외 상황에 대하여 개발자는 상황을
 *                           최대한 마무리 할 수 있도록 처리
 *          SQLException   : DB 오류 발생 -> DB 를 조회 수정 삭제 가 안될 수 있는 상황이므로 반드시 개발자가 처리해야하는 상황!!!
 *          ClassNot-FoundException : 누군가가... 개발자가 만든 class 문서 파일을 없애거나 문서 파일이름을 수정했는데,
 *                                    어떤 클라이언트는 해당 문서가 연관된작업을 해야하여 발생 -> 개발자가 무조건 처리
 *                                    ex ) 파일전송class -> fileTransClass 로 이름 교체 ===> 개발자는 파일명칭을 맞춰서 작업
 *
 *      Runtime Exception : 개발자가 잡아야하는 상황이 아니라 클라이언트가 해결해야하지 동작하는 상황
 *          Number-Format : 숫자넣으라 했는데 문자 넣었을 때 숫자 변환 실패 -> 문자 넣지 말고 숫자넣어라
 *          Null-Pointer : 우리는 1~4번문항이 있는데 빈칸으로 제출할 때 -> 빈칸넣지말고, 1~4번 사이 넣어서 다시하세요.
 *          ArrayIndexOutOfBounds : 우리는 1~4번문항이 있는데  6번 으로 제출할 때 -> 있는데에서 선택하고 제출하세요.
 */
public class Exception종류 {


    public void 트라이캐치구문확인하기기능() {

        try {
            // 성공 실패와 상관없이 무조건 개발자가 실행하고자 하는 코드 작성
            // 주로 폴더만들기, 파일만들기, 파일 전송, 이메일 전송 등
            // 미디어 데이터가 큰 파일을 만들고 수정하고 전송하고 삭제할 때 주로 사용
        } catch (SecurityException e) {
            System.out.println("접근할 수 있는 권한이 없어 문제가 발생했습니다. : " + e.getMessage());
            System.out.println("권한을 부여한 후 다시 실행해주세요. 메세지 보내기 ");
        } catch (RuntimeException e) {
            System.out.println("프로그램을 실행하던 도중 문제가 발생했습니다. : " + e.getMessage());

            if (e.getMessage() == "비밀번호가설정되어있음") {
                System.out.println("소비자에게 비밀번호를 요청하는 화면을 보내거나, 비밀번호 해지후 다시 실행하세요. 메세지 보내기 ");
            }
        } catch (Exception e) {
            // 위에서 catch 하지 못한 모 ~ 든 문제를 받는다.
            System.out.println("프로그램을 실행하던 도중 문제가 발생했습니다. : " + e.getMessage());
        } finally {
            System.out.println("프로그램을 종료합니다. ㅎㅎ");
        }
    }
}























