import java.io.IOException;

/**
 * try     = 시도하다 문제가 생길만한 코드를 실행하다.
 * catch   = 오류 발생 시 해결
 * finally = 성공/실패 관계없이 마지막에 무조건 항상 실행
 * <p>
 * try     = 오류가 발생할 상황을 실행할 때 반드시 최초 1회는 무조건 작성
 * catch   = 오류가 발생할 상황을 대비하여 try 를 작성했으면 catch 마찬가지로 1회 작성해야하나
 * 1개이상 이면 된다. 100개 1000개 천개 만들 수 있다.
 * 맨 마지막에 오는 catch는 Exception 이어야한다.
 * Exception = 모든 에러의 조상님 어머니 창시자
 * finally = 작성 생략 가능하며 0개 이상 1개 이하 작성 가능
 */
public class TryCatchFinally {


    public void 트라이캐치구문확인하기기능() {

        try {
            // 성공 실패와 상관없이 무조건 개발자가 실행하고자 하는 코드 작성
            // 주로 폴더만들기, 파일만들기, 파일 전송, 이메일 전송 등
            // 미디어 데이터가 큰 파일을 만들고 수정하고 전송하고 삭제할 때 주로 사용
        } catch (SecurityException e) { // RuntimeException 이 SecurityException 보다 광범위한 에러를 잡는 문서
            // SecurityException 은 RuntimeException 보다 에러를 확인하는 시야가 좁기 때문에 어짜피 RuntimeException
            // 으로 문제가 잡히므로 반드시 RuntimeException 와 SecurityException 을 함께 사용할 때는
            //RuntimeException 보다 위에 작성해야한다.
            System.out.println("접근할 수 있는 권한이 없어 문제가 발생했습니다. : " + e.getMessage());
            System.out.println("권한을 부여한 후 다시 실행해주세요. 메세지 보내기 ");
        } catch (RuntimeException e) {
            // 개발자가 처리해야하는 문제 상황을 e.getMessage() 기능을 활용해서 어떤 문제인지 보고 해결하기
            // e = 예외 상황이 담긴 공간의 명칭
            // .getMessage() = 어떤 예외 상황이 발생하게 되었는지 메세지를 가져와서 확인
            System.out.println("프로그램을 실행하던 도중 문제가 발생했습니다. : " + e.getMessage());

            if (e.getMessage() == "비밀번호가설정되어있음") {
                System.out.println("소비자에게 비밀번호를 요청하는 화면을 보내거나, 비밀번호 해지후 다시 실행하세요. 메세지 보내기 ");
            }
            // Exception 이 오기 전 catch는 개발자가 소비자가 동작하는 웹사이트에서 발생할 수 있는 모든 예외상황을을 파악하고
            // 그것에 대한 대응처리를 한 것

            // Exception 개발자도 발견하지 못한 문제가 발생했을 때 어떤 문제인지 사후 처리를 할 수 있도록 담아놓는 Exception
        } catch (Exception e) {
            System.out.println("프로그램을 실행하던 도중 문제가 발생했습니다. : " + e.getMessage());
            System.out.println("개발자가 생각하지도 못한 문제가 발생한 것 개발자는 이 문제를 나중에 소비자에게 어떻게 응대해야겠다는" +
                    "TODO 코드를 작성해야함");
            // 개발자가 발견하지 못한 문제상황을 예외로 담아둔 후 나중에 문제가 찍힌 예외를 확인하여 추후 에러 작업코드를 작성

        } finally {
            // 작성해도 되고, 안해도 되는데 만약 작성하면 2개이상 만들기 불가
            System.out.println("프로그램을 종료합니다. ㅎㅎ");
        }


    }
}























