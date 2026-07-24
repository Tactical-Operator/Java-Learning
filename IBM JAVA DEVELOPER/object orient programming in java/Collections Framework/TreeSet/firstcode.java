
import java.util.TreeSet;
class firstcode 
{
    public static void main(String[] args)
    {
       TreeSet<String> fruits=new TreeSet<>();
       fruits.add("Mango");
       fruits.add("Apple");
       fruits.add("Banana");
       fruits.add("Orange");
       fruits.add("Cherry");

       if(fruits.contains("Orange")){
        System.out.println("True");
       }
       //prints accordinf to inorder traversal
       System.out.println(fruits);
    }
}
