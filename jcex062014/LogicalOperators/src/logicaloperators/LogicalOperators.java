package logicaloperators;
public class LogicalOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        //is x lower than 20 and greater than 10?
        boolean res = x<20&&x>10;
        System.out.println(res);
        //is x lower than 20 or greater than 10?
        res = x<20||x>10;
        System.out.println(res);
    }
}
