class outerclass{
    void myMethod(){
        class MethodLocalInner{
            void display(){
                System.out.println("Inside method local inner class");
            }
        }
        MethodLocalInner inner=new MethodLocalInner();
        inner.display();
    }
}