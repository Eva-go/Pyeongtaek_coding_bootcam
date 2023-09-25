package Day3;

public class MethodTest {
    public void method1(){
        System.out.println("평균을 구해보자");
    }
    public void method2(int k) {
        System.out.println("method2값: "+k);
    }
    public void method3(int i, int j) {
        System.out.println("method3값: "+i+" "+j);
    }
    public String method_name() {
        return "세과목의 평균은";
    }
    public double method_ave(int i1,int i2,int i3) {
        return (i1+i2+i3)/3;
    }
}
