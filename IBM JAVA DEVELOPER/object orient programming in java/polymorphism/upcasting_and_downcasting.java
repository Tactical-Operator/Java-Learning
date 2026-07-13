class Parent{
    String name;
    void method(){
        System.out.println("Method from Parent");
    }
}
class Child extends Parent{
    int id;
    @Override void method()
    {
        System.out.println("Method from child class");
    }
}
class upcasting_and_downcasting{
    public static void main(String []args){


        //upcasting-----

        //type casting child class reference to a parent class reference
        Parent p=new Child();
        p.name="Ashwin Jadhav";
        System.out.println(p.name);
        p.method();// parent class method is overridden method hence Child's method will be exceuted.

        // downcasting implicitly

        // 
        Child c=(Child)p;

        c.id=1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();
       }
}
