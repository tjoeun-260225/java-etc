package extendsImplementsSuper.naver;

public abstract class 네이버서비스 {
    private String 아이디;
    private String 닉네임;
    public 네이버서비스() {}
    public 네이버서비스(String 아이디, String 닉네임) {
        this.아이디 = 아이디;
        this.닉네임 = 닉네임;
    }
    public void 로그인() {
        System.out.println(닉네임 + "님 네이버 로그인!");
    }
    public void 정보출력() {
        System.out.println("아이디 : " + 아이디 + " / 닉네임 : " + 닉네임);
    }
    // abstract = 완성하거라... 해야할 과제이기 때문에 무조건 private 은 안된다.. 일 안하려 하지마라..
    abstract void 탈퇴하기();
    abstract void 정보수정하기();
    abstract void 목록만들기();
    abstract void 가입하기();
    abstract void 구매하기();
    abstract void 글쓰기();
    abstract void 글보기();
    abstract void 글수정하기();
    abstract void 친구추가하기();
    abstract void 댓글쓰기();
    abstract void 채팅하기();
}
