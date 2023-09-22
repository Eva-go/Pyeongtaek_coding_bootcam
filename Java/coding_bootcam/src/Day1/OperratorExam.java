package Day1;

public class OperratorExam {
    public static void main(String[] args) {
        int x1 =5;
        int x2= 10;
        int y1 = x1+x2;
        int y2 = x1 -x2;
        int y3 = x1 * x2;
        double y4 = (double) x1 / (double) x2;
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(y4);

        System.out.println(x1 == x2);
        System.out.println(x1>x2);

        int age = 27;
        String adult = (age >= 20) ? "adult" : "child";
        System.out.println(adult);
    }
}
