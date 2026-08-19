// Writing to file code 

import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class file_writer{
    public static void main(String[] args) {
        
        try{
            FileWriter writer = new FileWriter("test.txt");

            writer.write(" Hello Operator\n");
            writer.write("Mission 1 : Destroy Naxals");

            writer.close();

            System.out.println("Data Successfully written");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
    }
}