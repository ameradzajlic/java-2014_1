package parsejsonman;
public class UserPosition {
    public int userid;
    public UserPoint position; 
    public static UserPosition parse(String incoming_string){
        UserPosition uPos = new UserPosition();
        UserPoint uPoint = new UserPoint();  
        String[] user_data = incoming_string.split(",");
        uPos.userid = Integer.parseInt(user_data[0].split(":")[1]);
        uPoint.x = Float.parseFloat(user_data[1].split(":")[1]);
        uPoint.y = Float.parseFloat(user_data[2].split(":")[1]); 
        uPos.position = uPoint;
        return uPos;
    }
    @Override
    public String toString(){
        return "id: " + this.userid + " x: " + this.position.x + " y: " + this.position.y;
    }
}
