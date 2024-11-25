package P1029;

public class User {
    // 필드
    String username;
    String email;
    String password;
    //생성자
    public  User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }
    // 메서드
    // 페스워드 변경하는 메서드
    public String setPassWord(String newPassWord){
        this.password = newPassWord;
        return  this.password;
    }
}
