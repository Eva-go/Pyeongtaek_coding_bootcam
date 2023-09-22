package Day2;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("숫자입력:");
        int num = scr.nextInt();
        for(int i=0; i<=num; i++){
            System.out.println(i);
        }

    }
}
