package simplestreamwriter; 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream; 
public class SimpleStreamWriter {
    public static void main(String[] args) throws IOException {
        class MyStream extends OutputStream { 
            @Override
            public void write(int b) throws IOException {  
                 String bytestring = String.format("%32s",Integer.toBinaryString(b)).replace(" ", "0");   
                 String l1 = bytestring.substring(0,8);
                 String l2 = bytestring.substring(8,16);
                 String l3 = bytestring.substring(16,24);
                 String l4 = bytestring.substring(24, 32);
                 char c1 =  (char)Byte.parseByte(l1, 2);
                 char c2 =  (char)Byte.parseByte(l2, 2);
                 char c3 =  (char)Byte.parseByte(l3, 2);
                 char c4 =  (char)Byte.parseByte(l4, 2);
                 StringBuilder word = new StringBuilder();
                 word.append(new char[]{c1,c2,c3,c4});
                 System.out.println(word);
            } 
        }
        MyStream ms = new MyStream();
        ms.write(1970496882);
    }
}
