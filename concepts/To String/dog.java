class Dog_name{
    String name="Bruno";

    public String toString(){
        return "Dog's name is "+name;
    }
}

class Dog{
    public static void main(String[] args){
        Dog_name d=new Dog_name();
        System.out.println(d); 
        // this will print Dog_name@2f92e0f4 not Bruno because java has no idea , the object may have 100 variables
        // so it prints the class name and some memory information 

        // so java says "Whenever someone wants to print an object,ask the object to describe itself"
        // that rule is toString()
        System.out.println(d);
    }
}