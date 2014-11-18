package mergefiles; 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException; 
import java.util.function.Function;
public class MergeFiles {
    public static void main(String[] args) throws FileNotFoundException, IOException { 
        FileInputStream[] streams = {
            new FileInputStream("firstfile.txt"),
            new FileInputStream("secondfile.txt")
        };
        FileOutputStream fos = new FileOutputStream("thirdfile.txt");
        int b;
        for(int i=0;i<streams.length;i++){
            while((b=streams[i].read())!=-1){
                fos.write(b);
            }
            streams[i].close();
        }
        fos.close();
    }
}
