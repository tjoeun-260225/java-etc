package extendsImplementsSuper.naver;

public class 블로그 extends 네이버 {
    //private String 아이디; -> 네이버에 이미 아이디 닉네임 이 존재하기 때문에 블로그 문서에서 굳이 작성할 필요가 없다.
   // private String 닉네임;
    private int 포스트수, 이웃수; // 각각 나눠서 두줄로 작성할 수 있지만 자료형이 같다면 한줄로 ,를 이용하여 구분지어 작성할 수 있다.
    public 블로그() {}
    public 블로그(String 아이디, String 닉네임, int 포스트수, int 이웃수) {
        // this. 현재 나의 class 문서 파일에 존재하는 필드 이름
        // this.아이디 = 아이디;  아이디 닉네임은 현재 블로그.java 파일에 존재하는 필드 이름이
        // this.닉네임 = 닉네임;                  아니라 네이버에 존재하는 필드 이름을 사용할 것 그래서 this 사용할 수 없다.
        // super() 를 이용해서 extends 네이버에 존재하는 필드 이름에 데이터를 저장하고 사용하겠다.
        super(아이디, 닉네임);
        this.포스트수 = 포스트수;
        this.이웃수 = 이웃수;
    }
    // extends 네이버에 있는 기능을 그대로 사용하고, 로그인을 블로그.java 입맛에 맞게 변형할 일이 없다면
    // 로그인() 기능을 작성할 필요가 없다. extends 네이버 에 써놓은 로그인() 기능을 사용하면 되는데 멋하러!!!! 또 쓰냐!!
    // public void 로그인() {
    // System.out.println(닉네임 + "님 네이버 로그인!");
    // }

    // @Override 작성하지 않아도 되지만,  extends 네이버에 존재하는 정보출력() 기능을 가져와서 수정했다라는 개발자 간의 표기 예의
    @Override // extends 네이버에 작성되어 있는 기능을 갖고와서 블로그.java 사용용도에 맞게 수정한다.
    public void 정보출력() {
        super.정보출력(); // extends 네이버에 작성되어 있는 정보출력() 기능을 그대로 사용하겠다.
        //System.out.println("아이디 : " + 아이디 + " / 닉네임 : " + 닉네임);
        System.out.println("블로그 포스트 : " + 포스트수 + "개" ); // 추가로 블로그.java에서 추가하고자 하는 기능좀 넣겠다.
        System.out.println("블로그 이  웃 : " + 이웃수 + "명" );
    }
}
