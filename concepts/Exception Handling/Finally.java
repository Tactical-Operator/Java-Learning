public class Finally {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println("This is try block");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");

        } finally {
            System.out.println("Code tuns even after exception");
        }
    }
}
