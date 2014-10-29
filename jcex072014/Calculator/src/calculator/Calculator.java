package calculator;
public class Calculator {
    public double operand1;
    public double operand2;
    public double add(){ return operand1 + operand2; }
    public double sub(){ return operand1 - operand2; }
    public double mul(){ return operand1 * operand2; }
    public double div(){ return operand1 + operand2; } 
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.operand1 = 2;
        c.operand2 = 5;
        System.out.println(c.add());
        System.out.println(c.sub());
        System.out.println(c.mul());
        System.out.println(c.div());
    } 
}
