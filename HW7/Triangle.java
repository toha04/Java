package Java.HW7;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String toString() {
        return super.toString() + " a=" + a + " b= " + b + " c= " + c;
    }
    @Override
    public double calcArea() {
        if (c > a + b || a > b + c  || b > a + c || a <= 0 || b <= 0 || c <= 0){
            return 0;
        } else {
            double s = (a + b + c) / 2;
           return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
    }
}
