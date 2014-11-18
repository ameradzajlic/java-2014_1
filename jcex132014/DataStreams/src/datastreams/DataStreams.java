package datastreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreams {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /* same type data stream writing */
        FileOutputStream fos_same_type = new FileOutputStream("testfile.txt");
        BufferedOutputStream bos_same_type = new BufferedOutputStream(fos_same_type);
        DataOutputStream dos_same_type = new DataOutputStream(bos_same_type);
        dos_same_type.writeInt(10);
        dos_same_type.writeInt(15);
        dos_same_type.writeInt(25);
        dos_same_type.close();
        
        /* same type data stream reading */
        FileInputStream fis_same_type = new FileInputStream("testfile.txt");
        BufferedInputStream bis_same_type = new BufferedInputStream(fis_same_type);
        DataInputStream dis_same_type = new DataInputStream(bis_same_type);
        System.out.println(dis_same_type.readInt());
        System.out.println(dis_same_type.readInt());
        System.out.println(dis_same_type.readInt());
        dis_same_type.close();
        
        /* automatic data stream reading */
        FileInputStream fis_auto_read = new FileInputStream("testfile.txt");
        BufferedInputStream bis_auto_read = new BufferedInputStream(fis_auto_read);
        DataInputStream dis_auto_read = new DataInputStream(bis_auto_read);
        try {
            while(true){
                System.out.println(dis_auto_read.readInt()); 
            }
        } catch(EOFException e){
                System.out.println("Stream reading finished"); 
        } finally {
            dis_auto_read.close();
        }
         
        /* different type data stream writing */
        FileOutputStream fos_diff_type = new FileOutputStream("testfile.txt");
        BufferedOutputStream bos_diff_type = new BufferedOutputStream(fos_diff_type);
        DataOutputStream dos_diff_type = new DataOutputStream(bos_diff_type);
        dos_diff_type.writeInt(10);
        dos_diff_type.writeFloat(15.5f);
        dos_diff_type.writeChar(65);
        dos_diff_type.writeUTF("ČĆŠĐčćšđ");
        dos_diff_type.close();
        
        /* different type data stream reading */
        FileInputStream fis_diff_type = new FileInputStream("testfile.txt");
        BufferedInputStream bis_diff_type = new BufferedInputStream(fis_diff_type);
        DataInputStream dis_diff_type = new DataInputStream(bis_diff_type);
        System.out.println(dis_diff_type.readInt());
        System.out.println(dis_diff_type.readFloat());
        System.out.println(dis_diff_type.readChar());
        System.out.println(dis_diff_type.readUTF());
        dis_diff_type.close(); 
    }
}
