package recursion;
public class Recursion {  
    static void recursiveFunction(int counter) { 
        System.out.println("Hello from myself " + counter);
        if(counter>1)
            recursiveFunction(--counter); //good solution
            //recursiveFunction(counter--); //poor solution
    }
    public static void counter(int start,RecursionControl stop)
    {
        System.out.println("Hey, I am called!");
        if(stop.value>start) {
                return;
            }
            ++stop.value;
            counter(start--,stop); 
    }
    public static int happening(int num){ 
	if(num==1){
            return 1;
        } else {
            return happening(num-1)+num;
        }
    }
    public static void main(String[] args) {
       recursiveFunction(10); 
       
       RecursionControl stop = new RecursionControl();
       int start = 5;
       stop.value = 2;
       counter(start,stop);
       
       System.out.println(happening(4));
    }
}
