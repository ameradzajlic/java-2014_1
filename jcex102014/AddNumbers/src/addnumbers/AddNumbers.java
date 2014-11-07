package addnumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        List numbers = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine(); 
            if(!line.equals("")){
                numbers.add(Integer.parseInt(line));
            } else { 
                int sum = 0;
                for(int i=0;i<numbers.size();i++){
                    sum+=(int)numbers.get(i);
                    System.out.print(numbers.get(i)+" ");
                }
                System.out.println("Result is: " + sum);
            }
        }
    }
}
