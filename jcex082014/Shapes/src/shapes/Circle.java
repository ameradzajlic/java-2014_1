package shapes;
public class Circle extends Shape {
    public final double PI = 3.14;
    public double r;
    public double area() {
       return r * r * PI;
    }
}