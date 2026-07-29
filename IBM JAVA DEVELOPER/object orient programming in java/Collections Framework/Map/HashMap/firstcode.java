
import java.util.*;
class firstcode 
{
    public static void main(String[] args)
    {
       HashMap<String,Integer> frequency =new HashMap<>();

       String[] words={"Apple","Banana","Apple","Mango","Banana","Orange"};

       for(String word:words){

        frequency.put(word,frequency.getOrDefault(word,0)+1);
       }

       System.out.println(frequency);

       System.out.println(frequency.containsKey("Apple"));
       System.out.println(frequency.containsValue(2));
       System.out.println(frequency.size());
       System.out.println(frequency.remove("Orange"));
       System.out.println(frequency);
    }
}

// to use +1 make sure the value is Integer
// use getOrDefault when we have to use frequency for any problem.