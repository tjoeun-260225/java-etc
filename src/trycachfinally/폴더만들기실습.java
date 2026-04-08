package trycachfinally;

import java.io.File;

public class 폴더만들기실습 {

    public void 폴더하나만들기기능() {
        File 폴더 = new File("단일폴더");

        try {
            if (폴더.mkdir()) {
                System.out.println("폴더 생성 성공!");
                System.out.println("만든 폴더 이름 : " + 폴더.getName());
                System.out.println("만든 폴더 경로 : " + 폴더.getPath());                   // 단일 폴더 생성이므로 getName() 과 결과가 동일
                System.out.println("전체         경로 : " + 폴더.getAbsolutePath()); // 전체경로 확인
            } else {
                System.out.println("폴더가 이미 존재합니다.");
                System.out.println("전체         경로 : " + 폴더.getAbsolutePath());
            }
        } catch (SecurityException e) {
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

    public void 폴더여러개만들기기능() {
        // a 폴더 안에 b 폴더 를 만들고 c폴더를 만들 때
        File 폴더 = new File("가/나/다");

        try {
            if (폴더.mkdirs()) {
                System.out.println("폴더 생성 성공!");
                System.out.println("만든 폴더 이름 : " + 폴더.getName());                    //   맨 마지막에 만들어진 폴더 명칭
                System.out.println("만든 폴더 경로 : " + 폴더.getPath());                       //   폴더를 다 수 만들 때 어떤 폴더들을 만들었는지 확인
                System.out.println("전체         경로 : " + 폴더.getAbsolutePath());   //  실제로 어디 만들어 졌는지 확인 (가장 많이 사용)
            } else {
                System.out.println("폴더가 이미 존재합니다.");
                System.out.println("전체         경로 : " + 폴더.getAbsolutePath());
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

