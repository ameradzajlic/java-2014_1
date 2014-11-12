package userfromstring; 
public class UserFromString {
    public static void main(String[] args) {
        String incoming_string = "1-peter-150"; 
        User user = User.parse(incoming_string); 
        System.out.println(user); 
    }
}
