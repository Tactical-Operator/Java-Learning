interface Animal{
    void sound();
}

class Dog implements Animal{
    public void sound(){
        System.out.println("bark");
    }
}

class test{
    public static void main(String[] args){
        Dog a=new Dog();
        a.sound();
    }
}