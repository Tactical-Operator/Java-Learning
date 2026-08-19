import java.io.File;
import java.io.IOException;

class File_create {
    public static void main(String [] args){
        File file = new File("test_file.txt");

        try{
            if(file.createNewFile()){
                System.out.println(" File Created");
            }
            else{
                System.out.println("File already exists");
            }
        } catch (IOException e){
            System.out.println("Something went wrong");
        }

        System.out.println(System.getProperty("user.dir"));

    }
}