package Day6;

public class MethodExam {
    public void method1(){
        System.out.println("MethodExam.method1");
    }

    public  void method2(int i){
        System.out.println("i= "+ i);
        System.out.println(i*100);
    }
    public int method3(){
        System.out.println("MethodExam.method3");
        return 55;
    }
    public void method4(int x, int y){
        System.out.println("x = "+y+", y = "+y);
        System.out.println(x+y);
    }
    public int method5(int x){
        return x*2;
    }
    public int add(int x,int y){
        return x+y;
    }

}
