package Day2;

import java.util.Scanner;

public class IfExam {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("num1: ");
        int num1=scr.nextInt();
        System.out.print("num2: ");
        int num2=scr.nextInt();
        if (num1<num2) {
            System.out.println("num2의 값이 더 큽니다.");
        }
        else{
            System.out.println("num1의 값이 더 큽니다.");
        }
    }
}
