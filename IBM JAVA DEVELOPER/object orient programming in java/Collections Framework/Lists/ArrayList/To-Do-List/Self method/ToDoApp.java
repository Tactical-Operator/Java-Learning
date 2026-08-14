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
            System.out.println("  2. View Tasks based on priority High > Medium > Low");
            System.out.println("  3. Change status to - Completed/Not Completed");
            System.out.println("  4. Exit");
            System.out.println();
            System.out.println("  Enter Your choice ");
            

            int choice =sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1: // add tasks
                System.out.println();
                System.out.println("  Adding Tasks ------");
                System.out.println();

                System.out.println("  Add Task Title");
                String title_name = sc.nextLine();

                System.out.println();

                System.out.println("  Set Priority - High / Medium / Low ");
                String set_priority = sc.nextLine();

                System.err.println(); 

                Task task = new Task(idCounter, title_name, set_priority);

                todolist.addTask(task);

                idCounter++;

                System.out.println("  Task Added Successfully");
                System.out.println();

                break;

                case 2: // view tasks
                System.out.println("  Displaying Tasks ------");
                System.out.println();

                todolist.displayTasks();
                break;

                case 3: // change status
                System.out.println("  Changing status ------");

                System.out.println("  Tell the id of the task whose " +
                                    "Status you want to be changed");
                int id_change = sc.nextInt();
                sc.nextLine();

                todolist.markTaskCompleted(id_change);
                
                System.out.println("  The task has been Marked as Completed for id = "+ id_change);
                System.out.println();
                break;

                case 4: // exit

                System.out.println("  Exiting........");
                return;

                default:
                    System.out.println("  Wrong choice");

           }
       }
    }
}
