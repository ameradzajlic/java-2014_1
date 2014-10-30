package inheritance;
public class Inheritance {
    public static void main(String[] args) {
        Person person = new Person("John", "Davidson");
        Student student = new Student("John", "Smith", "10/2014");               
        Professor professor = new Professor("Edward", "Owen", "Java Programming"); 
        person.show();
        student.show();
        professor.show();
        
        System.out.println(student);
        
        student.show();
        student.show("Peter");
        student.show("Peter","Jackson");
        
        
    }
}
