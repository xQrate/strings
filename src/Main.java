import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {

   try( FileWriter fw= new FileWriter("Q://Java//file.txt")) {
       System.out.println("Слова");
       String text = "Hello \ngods";

       fw.write(text);
       fw.append('\n');
       fw.flush();
   }
   catch (IOException ex) {
        System.out.println(ex.getMessage());
   }

   try( FileReader fr = new FileReader("Q://Java//file.txt")) {
     Scanner scan = new Scanner(fr);
     int i =1;
     while (scan.hasNextLine()){
         System.out.println(i + ":" + scan.nextLine());
         i++;
     }
fr.close();
   }
   catch (IOException ex){
       System.out.println(ex.getMessage());
   }

    }



}