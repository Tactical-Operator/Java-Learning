import java.io.File;

public class File_test{
    public static void main(String [] args){

        File file=new File("test.txt");

        if(file.exists()){
        System.out.println("File Exists");
    }
}
}