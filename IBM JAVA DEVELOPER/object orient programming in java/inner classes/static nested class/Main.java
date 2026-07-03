class outer_class{
    static int staticVariable=20;
     //  it can only access static members of the outer class directly
    //  no outer object is needed to create it 
     static class staticnestedclass // static nested class , does not belong to any outer object
    {
        void show(){
            System.out.println("Static variable value: "+ staticVariable);
        }
    }
}

class Main{
    public static void main(String []args){

    outer_class.staticnestedclass nested =new outer_class.staticnestedclass();
    nested.show();
    }
}