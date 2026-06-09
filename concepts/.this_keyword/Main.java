class Car {
    String color;

    void setColor(String color) {
         //means objects variable 
         this.color= color;
    }

    void display() {
        System.out.println(color);
    }
}
 public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.setColor("Red");

        Car c2 = new Car();
        c2.setColor("Blue");

        c1.display();
        c2.display();
    }
}