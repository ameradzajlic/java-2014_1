package customexceptions; 
public class MyException extends Exception {
    @Override
    public String toString(){
        return "Something nice";
    }
    @Override
    public String getMessage() {
        return "Some nice custom message";
    }
}
