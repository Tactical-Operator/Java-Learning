// program execution
// it is the controller of the Application
// it coordinates everything

import java.util.*;

public class ToDoApp {
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

        // we need to create an object of ToDoList class
        // to call its instance methods
        ToDoList todolist = new ToDoList(); 
        // when this runs 
        // public TodoList() {
        //     tasks = new ArrayList<>();
        // } so our ArrayList is now ready

        int idCounter = 1; // task id ;

        while(true){

            System.out.println("  ======= TO DO LIST =======");
            System.out.println("  1. Add Tasks");
            System.out.println("  2. View Tasks");
            System.out.println("  3. Change status");
            System.out.println("  4. Exit");
            System.out.println();
            System.out.println("  Enter Your choice ");
            System.out.println();

            int choice =sc.nextInt();
            //sc.nextLine();

            switch (choice) {
                case 1:
                System.out.println("  Adding Tasks ------");
                System.out.println();

                System.out.println("  Add Task Tile");
                String title_name = sc.nextLine();

                System.out.println();

                System.out.println("  Set Priority - High / Medium / Low ");
                String set_priority = sc.nextLine();

                System.err.println();

               



                Task task = new Task(idCounter, title_name, set_priority);

                
                break;

            }

        }

    }
}
