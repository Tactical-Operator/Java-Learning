// code 3: Main Program

public class Main {
    
    public static void main(String args[])
    {
        Voting obj =new Voting();
        try{
            obj.checkAge(24);
            System.out.println("Exception is not found");
        }
        catch(InvalidAgeException e){
            System.out.println("Exception caught" + e.getMessage());

        }
    }
}
