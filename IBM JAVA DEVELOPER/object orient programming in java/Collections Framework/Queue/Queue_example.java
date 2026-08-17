import java.util.LinkedList;
import java.util.Queue;

public class Queue_example{
    public static void main(String [] args){

        Queue<String> queue = new LinkedList<>();

        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        System.out.println(queue);
    }
}