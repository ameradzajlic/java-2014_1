package foreachloop; 
public class ForeachLoop { 
    public static void main(String[] args) {
        HeroesList heroes = new HeroesList();
        for(Object hero : heroes){
            System.out.println(hero);
        }  
    }
}
