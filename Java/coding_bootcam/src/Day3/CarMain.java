package Day3;

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("K5");
        Car c3 = new Car("GV", 90);
        c1.name ="GTX";
        c1.num = 1060;
        c2.num = 5;

        System.out.println(c1.name+" "+c1.num);
        System.out.println(c2.name+" "+c2.num);
        System.out.println(c3.name+" "+c3.num);
    }
}
