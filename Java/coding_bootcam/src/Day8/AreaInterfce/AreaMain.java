package Day8.AreaInterfce;

public class AreaMain {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(3.0,5.0);
        Shape s2 = new Circle(8.0);

        s1.getArea();
        s2.getArea();
        s1.getPerimeter();
        s2.getPerimeter();
        System.out.println("s1.Area: "+s1.getArea()+" s1.Perimter: "+s1.getPerimeter()+"\n"+"s2.Area: "+s2.getArea()+" s2.Perimter: "+s2.getPerimeter());
    }
}
