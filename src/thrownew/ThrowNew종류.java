package thrownew;

/**
 * Throw new : 개발자가 예외를 직접 발생시킬 때 사용
 * 클라이언트가 회사가 원하는 의도대로 웹사이트 / 앱 사이트 / 어플/ 프로그램 등
 * 조작할 때 회사는 "어 뭔가 잘못됐는데? 이거 안되는데?" 하고 신호를 코드로
 * 보내기 위해 사용
 * try-catch 적으로 문제가 없으나 회사에서는 원하지 않는 행동을
 * 소비자가 진행할 때 사용
 *
 * 기본 사용법
 * throw new 예외클래스("클라이언트에게 전달할 메세지")
 *
 * throw new 로 처리할 것을 if-else 하면 되는데 왜 이걸쓸까???
 *
 * if-else 와 throw new 는 목적이 다르다.
 * if-else   는 어떻게 할지 결정하는 것
 *            로도 잡을 수는 있지만, 코드가 깊어질수록 오류가 조용히 묻히거나
 *            계층마다 체크 코드가 반복되는 문제가 발생
 *            코드가 길어질수록 else 구문을 놓칠 수 있다.
 * throw new 는 여기서 더 이상 진행 불가
 *           여기서 더이상 실행 불가야 -> 코드 else 보다 가볍게 작성 가능
 *           원하는 곳에서 한 번만 처리
 *           예외 객체에 명확히 오류의사를 담을 수 있다.
 *
 * 개발자가 직접 만드는 throw new 익셉션클래스
 *  구분           상속                catch강제             예시
 * checked      Exception                 O                 IOException, SQLException ....
 * unchecked    RuntimeException          X                 IllegalArgumentException, ....
 *
 * IllegalArgumentException
 * - 잘못된 인수 메서드에 전달된 매개변수 데이터가 예상된 형식이나 범위를 벗어나는 경우 발생
 * - 넣는 값이 변수 자료형과 일치하지 않으면 발생
 * - int a = 1;
 * - a = "안녕하세요" 발생하는 예외상황
 *
 * 프로그램은 개발자가 작성한 상황-결과 순차적으로 진행
 * 코드적으로 진행할 수 없을 때 발생 하는 것이 exception = 내가 생각치도 못한 상황이 발생했어
 *
 * try-catch-finally = 문제를 최대한 최소화하기 위한 수단
 * - 최대한 웹사이트 / 모바일 사이트 / 프로젝트 / 어플 / 프로그램이 끊김없이 동작할 수 있도록
 *   개발자가 끊길만한 상황에 대비하여 대응 => 대응으로 인하여 고객은 프로그램을 유연하게 사용할 수 있다.
 * throw new exception = 회사가 원하는 대로 소비자가 움직일 수 있도록 가이드라인을 처리하는 수단
 * - 웹사이트 / 모바일 사이트 / 프로젝트 / 어플 / 프로그램 동작하는데는 문제가 없으나
 *   회사가 원하는 방향에 맞추어 소비자가 움직이지 않을 경우 제지를 하기 위한 용도
 */

public class ThrowNew종류 {

    public void 나이확인(int age) {
        // 금지라는 표기 보다는 상황을 어떻게 할지 결정
        if(age < 0 ) System.out.println("나이 적음 개발자 확인용 출력구문"); //  return null;
        // 진행하면 안되는 상황을 컷한다.
        if(age < 0 ) throw new IllegalArgumentException("나이는 음수일 수 없습니다."+age);

    }
}
