package Java.HW7;

public class Circle extends Shape{
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public void setRadius(){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    @Override
    public String toString() {
        return super.toString() + " radius=" + radius;
    }
    @Override
    public double calcArea() {
        final double PI = Math.PI;
        if (radius <= 0) {
            return 0;
        } else {
            return (radius * radius * 2 * PI);
        }
    }
}
