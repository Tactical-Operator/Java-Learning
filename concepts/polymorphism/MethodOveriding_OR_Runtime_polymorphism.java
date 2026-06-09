// Method Overiding / Runtime Polymorphism

// child class changes parent class's methods , before the method use @Override to override the function.

class Animal{
    void sound(){
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat Meows");
    }
}

class MethodOveriding_OR_Runtime_polymorphism{
    public static void main(String []args){

        Animal dog=new Dog();
        Animal cat=new Cat();

        dog.sound();
        cat.sound();
    }
}