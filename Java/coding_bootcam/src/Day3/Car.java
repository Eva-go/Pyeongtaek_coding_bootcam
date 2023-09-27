package Day3;

public class Car {
    public   String name;
    public int num;

    public Car(){
        System.out.println("디폴트 생성자 호출");
        this.name = name;
    }

    public Car(String n){
        this.name =n;
        System.out.println("string 생성자");
    }
    public Car(String m, int i){
        name = m;
        num = i;
        System.out.println("string, num 생성자");
    }
}
