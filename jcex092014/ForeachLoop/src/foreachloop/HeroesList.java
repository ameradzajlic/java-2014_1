package foreachloop;
import java.util.Iterator;
public class HeroesList implements Iterator,Iterable<Object> {
    int hero_index_position = 0;
    String hero1 = "Superman";
    String hero2 = "Spiderman";
    String hero3 = "Batman";
    @Override
    public boolean hasNext() {
        if(hero_index_position>2){
            return false;
        } else {
            return true;
        }
    }
    @Override
    public Object next() {
          int hip = hero_index_position++;
          if(hip==0)
              return hero1;
          else if(hip==1)
              return hero2;
          else
              return hero3;
    } 
    @Override
    public void remove() { } 
    @Override
    public Iterator<Object> iterator() {
        return this;
    } 
}
