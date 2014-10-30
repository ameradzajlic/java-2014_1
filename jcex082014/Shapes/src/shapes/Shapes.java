package shapes;
public class Shapes {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.r = 12;
        c.color = "crvena";
        c.x = 100;
        c.y = 200; 
        System.out.println(c.area());
    }
    
}
