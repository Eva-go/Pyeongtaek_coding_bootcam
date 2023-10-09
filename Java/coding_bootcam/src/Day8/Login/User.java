package Day8.Login;

public class User {
    private String userID;

    public User(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public void login(String userID,String password){
        if(getUserID().equals(userID)&&getPassword().equals(password)){
            System.out.println("로그인 하셨습니다.");
        }
        else {
            System.out.println("로그인에 실패했습니다. 아이디 또는 비밀번호를 다시 확인해주세요");
        }
    }

}
