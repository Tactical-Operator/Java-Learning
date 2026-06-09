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


        // upcasting-----
        // due to which the object is allowed to only access 
        // only parent class members and child class specified members(overriden methods),
        // but not all members
        Parent p=new Child();
        p.name="Ashwin Jadhav";
        System.out.println(p.name);
        p.method();// parent class method is overridden method hence Child's method will be exceuted.

        // downcasting explicitly
        // can acquire the properties of the parent object
        Child c=(Child)p;

        c.id=1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();
       }
}
