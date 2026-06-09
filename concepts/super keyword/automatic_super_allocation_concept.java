class A {
    int x =10;
    A(){
    
    System.out.println(x);
    }
    
}
class B extends A {
    int y=20; 
    B() {
        System.out.println("B constructor");
        
        System.out.println(y);
    }
}

class automatic_super_allocation_concept{
    public static void main(String[] args) {
        A object=new A();
        
    }
}