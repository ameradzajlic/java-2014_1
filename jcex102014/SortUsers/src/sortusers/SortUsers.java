package sortusers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortUsers {
    public static void main(String[] args) {
        ArrayList users = new ArrayList();
        users.add(new User(4,"Goran"));
        users.add(new User(2,"Ilija"));
        users.add(new User(6,"Nikola"));
        users.add(new User(1,"Petar"));
        users.add(new User(2,"Jovan"));
        users.add(new User(3,"Zoran")); 
        
        //sort with comparable interface
        //Collections.sort(users);
        
        //manual sort with selection sort
        for(int i=0;i<users.size();i++){
            int min = i;
            for(int u=i;u<users.size();u++){
                if(((User)users.get(u)).Id<((User)users.get(min)).Id){
                    min = u;
                }
            }
            User tmp = (User)users.get(i);
            users.set(i, users.get(min));
            users.set(min,tmp);
        }
        
        for(Object usr : users){
            System.out.println(((User)usr).ime);
        }
    } 
}
