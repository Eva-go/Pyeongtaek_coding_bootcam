package Day3;

import java.util.Scanner;

public class MethodMain {
    public static void main(String[] args) {
//        MethodExam m1 = new MethodExam();
//        m1.method1();
//        m1.method2(2);
//        m1.method3(2,5);
//        int v1 = m1.method4();
//        int v2 = m1.method5(89);

        MethodTest m = new MethodTest();
        m.method1();
        Scanner src = new Scanner(System.in);
        int i = src.nextInt();
        m.method2(i);
        int j = src.nextInt();
        int k = src.nextInt();
        m.method3(j,k);
        System.out.println(m.method_name()+" "+m.method_ave(i,j,k)+"입니다.");
        src.close();

    }
}
