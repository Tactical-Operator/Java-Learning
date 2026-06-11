class outer_class{
    static int staticVariable=20;

    static class staticnestedclass // static nested class
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