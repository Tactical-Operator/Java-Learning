class Test// if this class was to final then it be inherited
{
    final int x =10;

    final void show(int value){ //method cannot be overriden,implementation must stay fixed.
        // x=9; error
        int y=value;
        //x=20; error because  x is declared final
        System.out.println("passing parameter into a final method"+y);
    }
}

class Test_test extends Test{
    // void show(int value){ // will throw error
    void valid_show(){

    
        System.out.println(x);
    }
}
class Main_variable_final{
    public static void main(String[] args){
        Test_test object=new Test_test();
        Test object1=new Test();
        // object.x=9; error
        object.show(30);
        object1.show(20);
        
    }
}