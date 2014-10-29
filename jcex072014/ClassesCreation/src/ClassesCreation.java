public class ClassesCreation {
    public static void main(String[] args) {
        //creating cookie object
        Cookie cookie;
        cookie = new Cookie();
        
        //creating person object
        Person person = new Person();
        person.name = "Peter";
        person.surname = "Jackson";
        person.age = 50;
        person.height = 176;
        person.weight = 80;
        
        //creating tank crew person object
        TankCrewPerson tc_person = new TankCrewPerson();
        tc_person.experience = 57;
        tc_person.category = 1;
        tc_person.name_and_surname = "Yefreytor Vadim Vasilyev";
        tc_person.vehicle_id = 5; 
    }
    
}
