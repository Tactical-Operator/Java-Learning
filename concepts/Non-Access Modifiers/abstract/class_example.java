abstract class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void sound();
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