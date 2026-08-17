import java.util.*;
class firstcode     
{
    public static void main(String[] args)
    {
       TreeMap<Integer,String> map=new TreeMap<>();

       map.put(3,"Apple");
       map.put(1,"Mango");
       map.put(2,"");

       System.out.println(map);
       for(int key : map.keySet()){
        System.out.println(key+". " + map.get(key));
        ////
       }

       if(map.containsValue("Mango")){
        System.out.println("Mango exists");
       }
    }
}
