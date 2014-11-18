package bufferedstreams; 
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter; 
public class BufferedStreams {
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("testfile.txt")
        );
        
        bw.write("Hello"); 
        bw.flush();
        Thread.sleep(5000);
        bw.write("World");
        bw.close();
        
        BufferedReader br = new BufferedReader(
                new FileReader("testfile.txt")
        );
        String line = null;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
}
