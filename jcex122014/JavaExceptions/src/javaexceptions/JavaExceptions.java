package javaexceptions;
public class JavaExceptions {  
    public static void main(String[] args)  {  
        try {  
            Object[] array = new Integer[3]; 
            array[0] = "Hello"; 
        } catch(ArrayStoreException ex){
            System.out.println("I will never be catched");
        }  catch(ArithmeticException ex){
            System.out.println("Hey, you can't divide by zero!");
        }  catch(Exception ex){
            System.out.println("I am here just in case");
        } finally {
            System.out.println("I will be executed anyway");
        }
    }
}
