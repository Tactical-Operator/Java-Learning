import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Write_File_BufferedWriter {
    public static void main(String[] args)
    {
       try{
        FileWriter writer = new FileWriter("test.txt",true);

        BufferedWriter bf = new BufferedWriter(writer);

        bf.write("Hello Operator you have been assigned a new task");
        bf.newLine();
        bf.close();
       }
       catch(IOException e){
        System.out.println("Error" + e.getMessage());
       }
    }
}