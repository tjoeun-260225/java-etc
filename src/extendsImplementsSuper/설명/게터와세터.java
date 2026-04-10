package extendsImplementsSuper.설명;

public class 게터와세터 {
    // 필드 이름은 DB와 직접적으로 연관이 있는 상태
    private String 이름;
    private String 비밀번호;
    
    // 직접적으로 데이터 가져오고 수정하면 DB 문제가 발생
    // setter에서 간접적으로 잠시 데이터를 보관하고
    // 데이터 관련 처리가 모두 끝나면 db 와 직접적으로 붙어있는 dto 변수로 전달
    
    // getter에서 간접적으로 db에 보관되어 있는 데이터를 담아서 사용
}
