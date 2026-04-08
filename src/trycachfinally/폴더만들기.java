package trycachfinally;

import java.io.File;
// mkdir() = 폴더 하나만 만들 때 사용
// mkdirs() = 폴더 안에 폴더 안에 폴더들을 무수히 만들 때 사용 하나의 폴더 만들 때도 사용 가능

// mkdirs() = File("") 안에 /가 있으면 폴더 안에 폴더를 만들라는 표기이구나
public class 폴더만들기 {

    public void  폴더하나만들기(){
        File 폴더 = new File("폴더이름");

       try {
            if (폴더.mkdir()) {
                System.out.println("폴더 생성 성공!");
            } else {
                System.out.println("폴더가 이미 존재합니다.");
            }
        } catch (SecurityException e) { // e = exception 의 줄임말
           System.out.println("권한이 없어 폴더 만들기를 실패했습니다.");
       } catch (RuntimeException e) {
           System.out.println("프로그램 실행 중 소비자의 컴퓨터가 안좋은... 문제가 발생하여 실패했습니다.");
       } catch (Exception e) {
           System.out.println("SecurityException / RuntimeException 에서 catch 하지 못한 모든 문제를 여기서 확인합니다.");
           System.out.println("개발자는 출력 상태를 확인하여 예외상황을 위에 추가하여 고객에게 상황을 알려주세요.");
       } finally {
           System.out.println("폴더 하나 만들기를 종료합니다.");

       }
    }

    public void  폴더여러개만들기(){
        // a 폴더 안에 b 폴더 를 만들고 c폴더를 만들 때
        File 폴더 = new File("a/b/c");

        try {
            if (폴더.mkdirs()) {
                System.out.println("폴더들 생성 성공!");
            } else {
                System.out.println("폴더가 이미 존재합니다.");
            }
        } catch (SecurityException e) {
            System.out.println("권한이 없어 폴더 만들기를 실패했습니다.");
        } catch (RuntimeException e) {
            System.out.println("프로그램 실행 중 소비자의 컴퓨터가 안좋은... 문제가 발생하여 실패했습니다.");
        } catch (Exception e) {
            System.out.println("SecurityException / RuntimeException 에서 catch 하지 못한 모든 문제를 여기서 확인합니다.");
            System.out.println("개발자는 출력 상태를 확인하여 예외상황을 위에 추가하여 고객에게 상황을 알려주세요.");
        } finally {
            System.out.println("폴더 여러개 만들기를 종료합니다.");

        }
    }
}

