package userfromstring;
public class User {
    public String id;
    public String name;
    public String score;
    public static User parse(String incoming_string){
        User ret = new User();
        String[] exploded_string = incoming_string.split("-");
        ret.id = exploded_string[0];
        ret.name = exploded_string[1];
        ret.score = exploded_string[2];
        return ret;
    }
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.score;
    }
}
