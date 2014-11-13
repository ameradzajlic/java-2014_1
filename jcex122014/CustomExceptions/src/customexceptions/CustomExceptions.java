package customexceptions;
public class CustomExceptions {
    static void throwingUnchecked(){
        throw new MyUncheckedException();
    }
    static void throwingChecked() throws MyException{
        throw new MyException();
    }
    public static void main(String[] args) {
        throwingUnchecked();
        try { 
            throwingChecked();
        } catch (MyException ex){ }
        
        try {
            throw new MyException();
        } catch(MyException ex){
            System.out.println("Hey, this is same as regular Exception");
            System.out.println("Custom exception text: " + ex);
        }
    }
}
