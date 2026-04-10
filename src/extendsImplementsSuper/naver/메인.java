package extendsImplementsSuper.naver;

public class 메인 {
    public static void main(String[] args){
        블로그 A군 = new 블로그("kimcs","김철수", 30, 100);
        A군.로그인();
        A군.정보출력();
        // A군.아이디 = "김철수"; 네이버에서 아이디가 private 이라서 접근 할 수 없는 상태
        // -> setter getter 등장!
    }
}

