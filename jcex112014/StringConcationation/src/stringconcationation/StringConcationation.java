package stringconcationation;
public class StringConcationation {
    public static void main(String[] args) { 
        //String concationation with + operator
        String username = "Peter";
        String total_score = "250";
        String output = username + " " + total_score;  
        System.out.println(output);  
        
        //String concationation with concat method
        username = "Peter";
        total_score = "250";
        output = username.concat(" ".concat(total_score));  
        System.out.println(output);  
        
        //String concationation with StringBuilder object
        StringBuilder sb = new StringBuilder();
        sb.append("Peter");
        sb.append(" 250");
        
        System.out.println(sb.toString()); 
        
        //String manipulation
        String message = "Hello from my string";
        
        //treat string as character array
        System.out.println(message.length());
        char[] all_characters = message.toCharArray();
        for(char c : all_characters){
            System.out.println(c);
        }
        
        //replace part of string
        message = "Hello from my string";
        message = message.replace("my", "your");
        System.out.println(message);
        
        //get array of strings by delimiter
        String[] string_arr = message.split(" ");
        for(String str : string_arr){
            System.out.println(str);
        } 
    }
}
