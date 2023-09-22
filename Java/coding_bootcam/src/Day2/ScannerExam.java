package Day2;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.printf("입력하세요 : ");
        String name = scr.nextLine();
        System.out.printf(name);
        System.out.print("국어점수를 입력하세요 : ");
        int score1 = scr.nextInt();
        System.out.println(score1);
        System.out.println("이름은 "+name+"국어점수는 "+score1+" 점입니다.");
    }
}
