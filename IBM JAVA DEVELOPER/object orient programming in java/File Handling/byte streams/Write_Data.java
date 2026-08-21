import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write_Data{

    public static void main (String [] args) throws IOException{

        File new_file = new File("test.txt");
        new_file.createNewFile();

        try{
            FileOutputStream file = new FileOutputStream("test.txt",true);

            String text = "First Sentence \n";
            byte [] byte_text = text.getBytes();

            file.write(byte_text);
            System.out.println("Text was written");
            file.close();
        }
        catch(IOException e){
            System.out.println("Error Occured : "+ e.getMessage());
        }
    }

}