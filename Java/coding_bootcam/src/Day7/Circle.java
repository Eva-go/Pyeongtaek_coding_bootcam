package Day7;

public class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("원을 그립니다.");
    }

    void circledraw(){
        System.out.println("더 큰원을 그립니다.");
    }
}
