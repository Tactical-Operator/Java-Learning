class B{
    B(){
        System.out.println("B constructor");
    }

    void shop(){
        System.out.println("Shopping");
    }
}
public class Main{
    public static void main(String []args){
        B object=new B(); // every time you creat a object it will call constructor even if it is not there a default constructor will be called.
        object.shop();
        
    }
}