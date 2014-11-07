package simplecollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import sun.misc.Queue;

public class SimpleCollections {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("********** ArrayList **********");
        List cl_users = new ArrayList();
        cl_users.add("Peter");
        cl_users.add("Sally");
        cl_users.add("John");
        cl_users.set(1, "Sam");
        for(int i=0;i<cl_users.size();i++){
            System.out.println(cl_users.get(i));
        }
        
        System.out.println("********** HashSet **********");
        Set users_set = new HashSet();
        users_set.add("Peter");
        users_set.add("Sally");
        users_set.add("Peter");
        Iterator iter = users_set.iterator();
        while(iter.hasNext()){ System.out.println(iter.next()); }
        for(Object user : users_set){ System.out.println(user); }
       
        System.out.println("********** HashMap **********");
        HashMap users_map = new HashMap();
        users_map.put("user1", "Peter");
        users_map.put("user2", "Sally");
        users_map.put("user3", "John"); 
        System.out.println("user1 is " + users_map.get("user1"));
        iter = users_map.entrySet().iterator();
        while(iter.hasNext()){ 
            Map.Entry kvp = (Map.Entry)iter.next();
            System.out.println(kvp.getKey()+":"+kvp.getValue()); 
        }  
        
        System.out.println("********** Queue **********");
        Queue persons_queue = new Queue();
        persons_queue.enqueue("Superman");
        persons_queue.enqueue("Hulk");
        persons_queue.enqueue("Spiderman");
        while(!persons_queue.isEmpty()){
            System.out.println(persons_queue.dequeue());
        }
    }
}

