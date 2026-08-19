// Writing to file code 

import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class File_Write{
    public static void main(String[] args) {
        
        try{
            FileWriter writer = new FileWriter("test.txt",true);
                                                                        // true means: append mode 

            writer.write("\nHello Operator\n");
            writer.write("Mission 1 : Destroy Naxals");

            writer.close();

            System.out.println("Data Successfully written");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
    }
}