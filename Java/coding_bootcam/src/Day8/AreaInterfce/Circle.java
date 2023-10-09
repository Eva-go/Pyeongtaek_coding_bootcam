package Day8.AreaInterfce;

public class Circle implements Shape{
    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    //반지름 *반지름 *PI
    public double getArea() {
        return getRadius()*getRadius()*Math.PI;
    }

    @Override
    //반지름*2 *PI
    public double getPerimeter() {
        return getRadius()*2*Math.PI;
    }
}
