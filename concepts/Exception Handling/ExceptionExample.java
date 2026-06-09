

public class ExceptionExample {
    public static void main(String[] args){
        int numerator =10;
        int denominator =0;

        try{
            int result=numerator/denominator;
            System.out.println(result); 
        }catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by zero");
        }finally{
            System.out.println("this block executes regardless of an exception");
        }

    }
    
}
