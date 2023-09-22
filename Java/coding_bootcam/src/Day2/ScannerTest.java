package Day2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("num1: ");
        int num1=scr.nextInt();
        System.out.print("num2: ");
        int num2=scr.nextInt();
        System.out.println("num1 : "+num1+" num2 : "+num2);
    }
}
