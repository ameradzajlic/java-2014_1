package rectangleareaexample;
public class RectangleAreaExample {
    final static String measure = "cm";
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int res = a * b;
        String message = "Rectangle area is " + a + measure 
                + " * " + b + measure + " is " + res + measure;
        System.out.println(message);
    }
}
