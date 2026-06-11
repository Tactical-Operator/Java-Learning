class outer_class{
    int variable=10;

    class inner_class{
       void display(){
            System.out.println(variable);
        }        
    }
}

class inner_class_test{
    public static void main(String[] args){

        // instance of the outer class must be created first
        outer_class outer =new outer_class();

        // instance of innerclass
        outer_class.inner_class inner=outer.new inner_class();
        inner.display();
    }
}