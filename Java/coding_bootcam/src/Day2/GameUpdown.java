package Day2;

import java.util.Scanner;

public class GameUpdown {
    public static void main(String[] args) {
        int ran =(int) (Math.random() *100 +1);
        Scanner scr = new Scanner(System.in);

        for (int i=1;i<=10;i++){
            System.out.print("1~100 사이의 수를 입력 : ");
            int num = scr.nextInt();
            if(num==ran){
                System.out.println("정답!");
                break;
            }else if (num<ran)
                System.out.println("제 숫자보다 작아요");
            else
                System.out.println("제 숫자보다 커요!");
        }
        scr.close();
    }
}
