package calculator;
public class Calculator {
    public static void main(String[] args) {
        char op = '/';
        double a = 5;
        double b = 3;
        if(op=='+'){
            System.out.println(a+b);
        } else
        if(op=='-'){
            System.out.println(a-b);
        } else
        if(op=='*'){
            System.out.println(a*b);
        } else
        if(op=='/'){
            System.out.println(a/b);
        }
    } 
}
