package parsejsonman; 
import java.util.ArrayList; 
public class ParseJsonMan {
    static String cleanIncomingString(String incoming_string){
        incoming_string = incoming_string.replace("[{", "");
        incoming_string = incoming_string.replace("}]", "");
        incoming_string = incoming_string.replace("},{", "#");
        return incoming_string;
    }
    public static void main(String[] args) { 
        String incoming_string = "[{id:10,x:10.5,y:20},{id:5,x:30,y:40},{id:2,x:2,y:7}]";
        ArrayList userPositions = new ArrayList();
        String clean_users = cleanIncomingString(incoming_string);
        String[] users_strings = clean_users.split("#");
        for(int i=0;i<users_strings.length;i++){
            userPositions.add(UserPosition.parse(users_strings[i]));
        }
        for(Object up : userPositions){
            System.out.println(up);
        } 
    }
}
