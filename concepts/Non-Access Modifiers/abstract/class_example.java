// abstract class is an incomplete class 
abstract class Animal{ //cannot create object of abstract class 
    void eat(){ //parent class can force subclasses to implement it .
        System.out.println("Animal eats");
    }
    abstract void sound(); // doesnt need {}body // abstract method means every animal must define its own sound
}
class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}

class class_example{
    public static void main(String[] args){
        Dog ob=new Dog();
        // error -abstract class cannot be instantiated ,reason-class in incomplete
        ob.eat();
        ob.sound();
    }
}