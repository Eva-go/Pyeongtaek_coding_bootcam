package Day4;

public class Car {
    String name;
    int number;
    String color;
    public  Car (){
        System.out.println("Car의 디폴트 생성자");
    }
    public Car (String car)
    {
        this.name = car;
    }
    public void run() {
        System.out.println("달리다.");
    }
}
