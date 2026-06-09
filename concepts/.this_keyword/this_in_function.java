import java.util.*;

class Mobile{
    void ring(){
        System.out.println("ringing...");
    }
    void receivecall(){
        this.ring();
        System.out.println("Call received");
    }
}

class this_in_function 
{
    public static void main(String[] args)
    {
       Mobile m1=new Mobile();
       m1.receivecall();
       Mobile m2=new Mobile();
       m2.receivecall();
    }
}