class A{
    A(){
        show();
    }

    void show(){
        System.out.println("A class show");
    }
}

class B extends A{
    int x=10;

    void show(){
        System.out.println("B class show ");
    }
}
public class runtime_polymorphism_and_dynamic_method_dispatch{
    public static void main(String []args){
        A object=new B();
    }
}