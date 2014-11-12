package simpletypewrappers;
public class SimpleTypeWrappers {
    public static void main(String[] args) {
        Integer my_integer = 10;
        my_integer += 25;
        System.out.println(my_integer);
        
        Integer my_integer_obj = new Integer(10);
        System.out.println(my_integer);
        
        Integer my_integer_from_string = new Integer("10");
        System.out.println(my_integer_from_string);
        
        //Uncomment to provoke error
        /*
        Integer my_integer_from_bad_string = new Integer("hello");
        System.out.println(my_integer_from_bad_string);
        */
        
        float x = my_integer.floatValue();
        double y = my_integer.doubleValue();
        byte z = my_integer.byteValue();
        int i = 35;
        System.out.println(my_integer.compareTo(i));
        System.out.println(my_integer==i);
        
        int parsed_int = Integer.parseInt("150");  
        System.out.println(parsed_int); 
        
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.BYTES);
        
    }
}

