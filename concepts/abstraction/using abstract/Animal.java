// abstraction using abstract class 
// an abstract class is a class that cannot be instantiated directly.it can contain:

// abstract methods(without implementation)
// concrete methods(with implementation)
// fields(instance variables)
// constructors
// a class can extend only one abstract class

abstract  class animal // abstract class defines a common structure for all animals
{
    abstract void sound(); // abstract method
}


class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}


class Animal 
{
    public static void main(String args[])
    {

        Cat c=new Cat();
        Dog d=new Dog();
        c.sound();
        d.sound();

    }
}