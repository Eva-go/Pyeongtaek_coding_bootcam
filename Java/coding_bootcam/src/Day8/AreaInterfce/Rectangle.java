package Day8.AreaInterfce;

public class Rectangle implements Shape{
    private double x;
    private double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    @Override
    public double getArea() {
        return getX()*getY();
    }

    @Override
    public double getPerimeter() {
        return (getX()*2)+(getY()*2);
    }
}
