package Day6;

public class MethodMain {
    public static void main(String[] args) {
        int i1 =55;
        int x =0;
        MethodExam m = new MethodExam();
        m.method1();
        m.method2(i1);
        x=m.method3();
        System.out.println(x);
        m.method4(21,144);

    }
}
