// Super Keyword uses- 1. use Super keyword to access parent class variables

import java.util.*;
class Super_keyword_test 
{
    int a=10;
    int b=20;
}

class Super_keyword_test_child extends Super_keyword_test{
    int a =20;
    int b =30;


    Super_keyword_test_child(int a,int b){
        System.out.println(a+" "+b);
        System.out.println(this.a+" "+super.b);
    }
}



class super_keyword_using_variables{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();

       Super_keyword_test_child object=new Super_keyword_test_child(a,b);
       
       
    }
}