// code to create a file directly


import java.io.File;
import java.io.IOException;
class direct_file_create 
{
    public static void main(String[] args) throws IOException
    {
       File file = new File("new.txt");
       file.createNewFile();

    }
}