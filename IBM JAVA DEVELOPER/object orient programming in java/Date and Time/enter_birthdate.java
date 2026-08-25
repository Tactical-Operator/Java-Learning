import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class enter_birthdate{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        String birthdateInput = sc.nextLine(); //yyyy-MM-dd

        LocalDate birthdate = LocalDate.parse(birthdateInput);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");

        String formattedBirthdate = birthdate.format(formatter);

        System.out.println("Name : "+name + " BirthDate : "+ formattedBirthdate);

        sc.close();
    }
}