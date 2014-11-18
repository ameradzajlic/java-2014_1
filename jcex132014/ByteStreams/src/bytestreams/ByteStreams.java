package bytestreams; 
import java.io.*;
public class ByteStreams {
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
        //write bytes to file
        FileOutputStream fos = new FileOutputStream("testfile.txt"); 
        fos.write(104);
        fos.write(101);
        fos.write(108);
        fos.write(108);
        fos.write(111);
        fos.flush();
        fos.close(); 
        
        //read bytes from file
        FileInputStream fis = new FileInputStream("testfile.txt");
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        fis.close();
        
        //automatic read bytes from file
        FileInputStream fis1 = new FileInputStream("testfile.txt");
        int b;
        while((b=fis1.read())!=-1){
            System.out.println(b);
        } 
        fis1.close();
         
    }
}
