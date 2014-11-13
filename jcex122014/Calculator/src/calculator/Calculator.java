package calculator;
public class Calculator {
    static int calculate(int a, int b, String op)
    {
        if(op.equals("+"))
                return a+b;
        if(op.equals("-"))
                return a-b;
        if(op.equals("/"))
                return a/b;
        if(op.equals("*"))
                return a*b; 
        return 0;
    } 
    public static void main(String[] args){
           int x = calculate(5,0,"/");
           System.out.println(x);
    } 
}
