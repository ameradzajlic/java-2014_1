package usersexample;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsersExample {
    public static void main(String[] args) throws FileNotFoundException, IOException { 
      BufferedReader br = new BufferedReader(new FileReader("users.txt")); 
      String line;
      while((line=br.readLine())!=null){
                        String[] user = line.split("\\|");
                        System.out.println("User Id: " + user[0].split("\\:")[1]);
                        System.out.println("First name: " + user[1].split("\\:")[1]);
                        System.out.println("Last name: " + user[2].split("\\:")[1]);
                        System.out.println("Jmbg: " + user[3].split("\\:")[1]);
                        System.out.println("------------------------------------");
      } 
      br.close();
    }
}
