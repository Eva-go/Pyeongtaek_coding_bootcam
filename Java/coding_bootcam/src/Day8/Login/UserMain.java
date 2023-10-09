package Day8.Login;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("회원 가입(아이디를 입력하세요): ");
        String ID = scr.next();
        System.out.println("입력하신 아이디는 : "+ID+" 입니다. ");
        System.out.println("비밀번호를 입력하세요 : ");
        String PW = scr.next();
        System.out.println("입력하신 비밀번호는 : "+PW+"입니다.");
        User user = new User(ID,PW);

        System.out.println("로그인을 하시겠습니까? Y/N");
        String login = scr.next();
        if (login.equals("y")||login.equals("Y")) {
            System.out.println("아이디를 입력하세요: ");
            String UID = scr.next();
            System.out.println("비밀번호를 입력하세요: ");
            String UPW = scr.next();
            user.login(UID,UPW);
        }
        else if(login.equals("n")||login.equals("N")){
            System.out.println("프로그램을 종료합니다.");
        }
        else{
            System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
        }
        scr.close();
    }
}
