package classes; // always mention the folder name in which this code is if using package concept for importing classes
public class item_not_found extends Exception{
    public item_not_found(String message){
        super(message);
    }
}