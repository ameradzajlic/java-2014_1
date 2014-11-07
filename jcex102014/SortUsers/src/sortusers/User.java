package sortusers;
public class User implements Comparable<Object>{
public int Id;
public String ime;
public User(int id, String ime)
    {
        this.Id = id;
        this.ime = ime;
    } 
    @Override
    public int compareTo(Object o) {
        User comparer = (User)o;
        if(comparer.Id>this.Id){
            return -1;
        } else if (comparer.Id<this.Id) {
            return 1;
        } else {
            return 0;
        }
    }
}
