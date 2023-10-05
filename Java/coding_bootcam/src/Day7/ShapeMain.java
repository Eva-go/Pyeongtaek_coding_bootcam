package Day7;

public class ShapeMain {
    public static void main(String[] args) {
        Shape s = new Shape();
        Circle c = new Circle();
        Shape s2 = (Shape)c;
        Circle c2 = (Circle)s;

        s2.draw();
        c2.circledraw();
    }
}
