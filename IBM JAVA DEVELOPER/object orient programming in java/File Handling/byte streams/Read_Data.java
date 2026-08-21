
import java.io.FileInputStream;
import java.io.IOException;

public class Read_Data{
    public static void main (String []args){

        // try{
        //     FileInputStream file = new FileInputStream("test.txt");

        //     byte[] data = file.readAllBytes();
        //     String text = new String(data);
        //     System.out.println(text);
        //     file.close();
        // }
        // catch(IOException e){
        //     System.out.println("Error issued : "+e.getMessage());
        // }

        try{
            FileInputStream file =new FileInputStream("test.txt");

            int data;

            while((data = file.read()) !=-1){
                System.out.print((char)data);

            }
            file.close();
        }catch(IOException e){
            System.out.println("error " + e.getMessage());
        }
    }
}