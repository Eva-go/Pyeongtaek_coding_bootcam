package Day2;

import java.util.Scanner;

public class ElesIfTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 :");
        int num = scanner.nextInt();
        if(0<num){
            System.out.println("0보다 큽니다.");
        }
        else if(0>num){
            System.out.println("0보다 작습니다");
        }
        else {
            System.out.println("0과 같습니다.");
        }
//        System.out.print("나이를 입력하세요 : ");
//        int age = scanner.nextInt();
//
//        if (age>=18)
//            System.out.println(age+"세 이상은 성인입니다");
//        else if(age<=18)
//            System.out.println(age+"세 이하은 미성년자 입니다.");
    }
}
