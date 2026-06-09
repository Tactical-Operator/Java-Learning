class Person{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
class private_example{
    public static void main(String []args){
        Person p=new Person();
        p.setName("Ashwin");// public methods can be accessed even if it has private variables usage.
        // p.name="Jadhav"; this will throw error because it's private and no other class can access it.
        // System.out.println(p.name); // this is also illegal
        System.out.println(p.getName());// this will print because methods can be accessed which are public .
    }
}


// important- only outside classes can still interact through controlled public methods.