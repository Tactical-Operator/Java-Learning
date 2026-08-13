// to store the tasks created

import java.util.*;

public  class ToDoList {

     ArrayList<Task> tasks;

    // constructor to create a new arraylist
    // when a ToDoList is created :
    // create an empty ArrayList
    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void displayTasks() {

        for (Task task : tasks) {

           System.out.println(" _______________________________");
           System.out.println("|                               |");
           System.out.printf("|  ID = %-24s|%n", task.get_id());
           System.out.printf("|  Title = %-21s|%n", task.get_task_title());
           System.out.printf("|  Priority = %-18s|%n", task.get_priority());
           System.out.printf("|  Status = %-20s|%n", task.get_status());
           System.out.println("|_______________________________|");
           System.out.println();
        }
    }

    public void markTaskCompleted(int id){

        for(Task task:tasks){

            if(task.get_id()==id)
            {
                task.markCompleted();

                System.out.println("  Test marked as completed");

                return;
            }
        }
        System.out.println("  Task not Found");
    }

}
// at this point ToDoList can :
// 1. create an empty list
// 2. Accept Task Objects
// 3. Store those Task Objects
