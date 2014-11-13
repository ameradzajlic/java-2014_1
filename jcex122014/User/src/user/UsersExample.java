package user;
public class UsersExample {
    public static void main(String[] args) {
        try {
            User u = new User(10, "Petar", "Petrovic", "petrov@mail.mm");
        } catch (InvalidIdException ex) {
            System.out.println("Nepravilan ID");
        } catch (InvalidFirstNameException ex) {
            System.out.println("Nepravilno Ime");
        } catch (InvalidLastNameException ex) {
            System.out.println("Nepravilno prezime");
        } catch (InvalidEmailException ex) {
            System.out.println("Nepravilan e-mail");
        }
    }
}
