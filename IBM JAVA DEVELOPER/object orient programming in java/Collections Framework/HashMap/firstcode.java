
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
    }
}

// to use +1 make sure the value 