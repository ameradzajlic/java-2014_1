package methodparams;
public class MethodParams {
    public static int useVarargs(int... operands){
        int result = 0;
        for(int i=0;i<operands.length;i++){
            result+=operands[i];
        }
        return result;
    }
    public static void passByValue(int x){
        x = 25;
    }
    public static void passByReference(Car car){
        //Car becomes beetle here
        car.model = "Beetle";
    }
    public static void emptyResult(){
        System.out.println("Hello, nothing for you!");
    }
    public static int add(int a, int b){
        int result = a + b;
        return result;
    }
    public static void main(String[] args) {
        
        //Method with input and oputput parameters
        int res = add(2,3);
        System.out.println(res);
        
        //Method without output parameters
        emptyResult();
        
        //Pass by reference
        Car car = new Car();
        //Car model is set to Renault 4
        car.model = "Renault 4";
        //Method will change object state
        passByReference(car);
        //What do you expect here? Renault 4 or Beetle
        System.out.println(car.model);
        
        //Pass by value
        int x = 10;
        passByValue(x);
        System.out.println(x);
        
        //Use varargs
        System.out.println(useVarargs(1,5,12));
    }  
}
