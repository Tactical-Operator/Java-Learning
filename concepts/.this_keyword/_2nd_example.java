import java.util.*;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
    void setName(String name) {
        this.name = name;
    }    void display() {
        System.out.println(name);
    }
}
class second_Student extends Student{
    second_Student(String c){
        super(c);
        System.out.println("This is a constructor");
    }
}
public class _2nd_example {
    public static void main(String[] args) {
        Student obj = new Student("Ashwin Jadhav");
        second_Student second_obj=new second_Student("Tactical_Operator");
        obj.display();

    }
}