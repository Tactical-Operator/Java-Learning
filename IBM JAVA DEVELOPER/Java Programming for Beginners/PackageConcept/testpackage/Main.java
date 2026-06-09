// Declare the package name
package testpackage;

// Import the Greeting class from mypackage
import mypackage.Greeting;

public class Main {
    public static void main(String[] args) {
        // Create an object of Greeting class
        Greeting greet = new Greeting();

        // Call the sayHello method
        greet.sayHello("Ashwin");
    }
}
