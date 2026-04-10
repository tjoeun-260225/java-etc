package extendsImplementsSuper.다형성;

public class 프로젝트실행 {
    public static void main(String[] args) {
        카카오톡 톡 = new 카카오톡();                                       // @RequiredArgsConstrutor 또는 @Autowired 를 이용하기 때문에 new 사용하지 않는 상태
        톡.실행();

        카카오맵 맵 = new 카카오맵();
        맵.실행();

        카카오페이 페이 = new 카카오페이();
        페이.실행();
    }
}
