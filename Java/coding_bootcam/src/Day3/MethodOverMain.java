package Day3;

public class MethodOverMain {
    public static void main(String[] args) {
       MethodOverTest mt = new MethodOverTest();

       int v1 = mt.add(3,4);
       double v2 = mt.add(5.0,4.0);
       String v3 = mt.add("5","6");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
