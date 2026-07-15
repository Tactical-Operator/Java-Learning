import java.io.FileReader;
import java.io.IOException;
import java.util.*;
class Correctfinallyusage 
{
    public static void main(String[] args)
    {
       FileReader file=null;
       try{
        file=new FileReader("exale.txt"); // prepare the file so Java can read from it
        System.out.println("Done");
        
        System.out.println("");
       }
       catch(IOException e){
        System.out.println("Error Reading File:"+e.getMessage());
       }
       finally{
        try{
            if(file!=null){
                file.close(); // return the book access 
            }
        }
        catch(IOException e){
            System.out.println("error Closing File:"+e.getMessage());
        }
       }
   }
}
