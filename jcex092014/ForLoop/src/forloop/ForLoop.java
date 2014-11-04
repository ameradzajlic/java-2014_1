package forloop; 

public class ForLoop {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("Hello!!!");
        }
        
        for(int i=0;i<5;i++)
            System.out.println("Hello!!!");
        
        for(int i=0;i<5;i++)
            System.out.println("Hello!!!");
            System.out.println("I am actually not part of loop");
            
        for(int i=0,j=10,u=25;i<20&&j<30&&u>15;i+=2,j+=4,u--){
            System.out.println("i:"+i+" j:"+j+" u:"+u);
        }
        
        int i;
        for(i=0;i<5;i++) { }
        System.out.println("i is " + i); 
    }
}
