public abstract class Animal{
    private String name;
    private String food;

    public Animal(String name){
        this.name=name;// refer to the objet currently being created
    }

    public String sound(){
        return null;
    }

    public void setFood(String food){
        this.food=food;
    }

    public String getFood(){
        return this.food;
    }

    public String toString(){
         return this.name + " says " + this.sound() + " and eats " + this.food;
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    public String sound(){
        return "Woof";
    }
}

class Cow extends Animal{
    public Cow(String name){
        super(name);
    }
    public String sound(){
        return "Moo";
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    public String sound(){
        return "Meow";
    }
}