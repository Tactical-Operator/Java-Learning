class outer_class{
    static int age =10;

     class inner_class{
        void show(){
            System.out.println(age);
        }
    }
}
class Main{
    public static void main(String[] args) {
        outer_class outer=new outer_class();
        outer_class.inner_class inner=outer.new inner_class();
        inner.show();
    }
}