package inheritance;
public class Student extends Person {
    public String indexNumber;
    public Student(String firstName, String lastName, String indexNumber){
        super(firstName,lastName);
        this.indexNumber = indexNumber;
    }
    
    @Override
    public void show(){
        System.out.println("Student: " + firstName + " " + lastName + " " + indexNumber);
        super.show();
    } 
    public void show(String firstName){
        System.out.println(firstName);
    }
    public void show(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }
    
    @Override
    public String toString(){
        return "Hello from " + firstName;
    }
}
