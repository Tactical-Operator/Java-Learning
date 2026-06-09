// abstraction using interface class

// interface is a contract that classes must follow.It mainly contains method declarations

// any class that implements the interface must provide the declared method
// a class can implement multiple interfaces

interface Animal{
    void sound();
    void eat();
}

class Dog implements Animal{

    public void sound(){
        System.out.println("Barks");
    }
    public void eat(){
        System.out.println("Eats");
    }
}

public class Main{
    public static void main(String args[]){
        Dog d=new Dog();
        d.sound();
        d.eat();

    }
}