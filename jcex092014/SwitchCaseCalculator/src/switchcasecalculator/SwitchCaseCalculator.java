package switchcasecalculator;
public class SwitchCaseCalculator {
    public static void main(String[] args) {
        char op = '/';
        double a = 5;
        double b = 3;
        switch(op){
            case '+':
                System.out.println(a+b);
            break;
            case '-':
                System.out.println(a-b);
            break;
            case '*':
                System.out.println(a*b);
            break;
            case '/':
                System.out.println(a/b);
            break; 
        }
    } 
}
