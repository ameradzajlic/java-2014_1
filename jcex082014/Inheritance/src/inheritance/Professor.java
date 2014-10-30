package inheritance;
public class Professor extends Person {
    public String className;
    public Professor(String firstName, String lastName, String className) {
        super(firstName, lastName);
    }
    @Override
    public void show(){
        System.out.println("Professor " + firstName + " " + lastName + " " + className);
    }
}
