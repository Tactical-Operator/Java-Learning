class outerclass{
    void myMethod(){
        class MethodLocalInner{
            void display(){
                System.out.println("Inside method local inner class");
            }
        }
        // object of inner class should be made inside the same method
        // because non static methods can only be called through an object
        MethodLocalInner inner=new MethodLocalInner(); 
        inner.display();
    }
}
public class Main{
    public static void main(String[] args){
        outerclass o=new outerclass();
        o.myMethod();
    }
}