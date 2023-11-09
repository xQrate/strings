import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {

   try( FileWriter fw= new FileWriter("Q://Java//file.txt")) {
       String text = "hello gods";
       fw.write(text);
       fw.append('\n');

       fw.flush();
   }
   catch (IOException ex) {
        System.out.println(ex.getMessage());
   }
   try( FileReader fr = new FileReader("Q://Java//file.txt")) {
        char[] buf = new char[256];
        int c;

        while((c = fr.read(buf))>0){
            if(c < 256){
                buf = Arrays.copyOf(buf, c);

            }
            System.out.println(buf);

        }

   }
   catch (IOException ex){
       System.out.println(ex.getMessage());
   }
    }



}