// Method Overloading / Compile-time polymorphism
// multiple methods with same name but differnet parameters.

class Sum{
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
}

class MethodOverloading_OR_Compiletime_polymorphism{
    public static void main(String []args){

        Sum sum=new Sum();

        System.out.println(sum.add(4,5));
        System.out.println(sum.add(3,4,6));
    }
}

