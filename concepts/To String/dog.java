class Dog_name{
    String name="Bruno";
}

class Dog{
    public static void main(String[] args){
        Dog_name d=new Dog_name();
        System.out.println(d); // this will print Dog_name@2f92e0f4 not Bruno
    }
}