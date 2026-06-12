package src;

import classes.item_not_found; // import foldername.code.java when importing a class 
import java.util.*;
class GroceryShopping_2 {

    
    public static void main(String[] args) throws item_not_found

    {
        Scanner sc = new Scanner(System.in);
        GroceryShopping_2 search_item_object=new GroceryShopping_2();
        String[] items = new String[5];
        float[] item_price = new float[5];

        items[0] = "IceCream";
        item_price[0] = 20;
        items[1] = "Mango";
        item_price[1] = 20.5f;
        items[2] = "Orange";
        item_price[2] = 30.5f;
        items[3] = "ChaatMasala";
        item_price[3] = 2;
        items[4] = "Spinach";
        item_price[4] = 40;

        

        while (true) {
            float total_bill = 0f;

            while (true) {

                try {

                    System.out.println("Enter the name of the item(or type 'finish' to end shopping");

                    String item_input = sc.nextLine(); // accepting user input

                    // check if the user wants to finish or not
                    if (item_input.equalsIgnoreCase("finish")) {
                        System.out.println("Your Total Bill is : Rs" + total_bill);
                        System.out.println("Thank you for using the shopping cart. Goodbye!");
                        break;
                    }
                
                    int item_number = -1;

                    // find the index of the array
                    for (int i = 0; i < items.length; i++) {
                        if (item_input.equalsIgnoreCase(items[i])) {
                            item_number = i;
                            break;
                        }
                    }

                    if (item_number == -1) {
                        throw new item_not_found(
                                "Item " + item_input + " not found, please select the available items");
                    }
                    System.out.println("Enter The Quantity of " + items[item_number] + ":");
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    total_bill = total_bill + (quantity * item_price[item_number]);
                    System.out.println("Added " + quantity + " X " + items[item_number] + " to the bill"
                            + ". Current Total:" + "Rs" + total_bill);

                   
                } catch (item_not_found e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Enter 'exit' to quit the shopping cart");
            String exit = sc.nextLine();
            if (exit.equalsIgnoreCase("exit")) {
                break;
            }
        }
        sc.close();
    }
}