package compareoperators;
public class CompareOperators {
    public static void main(String[] args) {
        //operator ==
        int x = 10;
        int y = 20; 
        boolean res = x == y;
        System.out.print("x equals y : ");
        System.out.println(res);
        //common mistake
        boolean x1 = false;
        if(x1=true){
            System.out.println("This shouldn't be shown");
        }
        //operator <
        res = x < y;
        System.out.print("x lower than y : ");
        System.out.println(res);
        //operator >
        res = x > y;
        System.out.print("x greater than y : ");
        System.out.println(res);
        //operator <=
        res = x <= y;
        System.out.print("x lower or equals y : ");
        System.out.println(res);
        //operator >=
        res = x >= y;
        System.out.print("x greater or equals y : ");
        System.out.println(res);
    }
    
}
