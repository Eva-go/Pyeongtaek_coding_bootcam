package Day4;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        Board b =new Board();
        Scanner scr =new Scanner(System.in);
        System.out.print("이름은 : ");
        String name = scr.nextLine();
        b.setName(name);
        System.out.print("content은 : ");
        String content =scr.nextLine();
        b.setContent(content);
        String name1 = b.getName();
        String Content1 =b.getContent();
        System.out.println("결과는 : "+name1+" "+Content1);

    }
}
