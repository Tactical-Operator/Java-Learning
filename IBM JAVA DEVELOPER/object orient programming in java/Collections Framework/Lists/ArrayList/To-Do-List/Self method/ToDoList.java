// to store the tasks created

import java.util.*;

public  class ToDoList {

    private ArrayList<Task> tasks;

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

            System.out.println(task.get_id());
            System.out.println(task.get_task_title());
            System.out.println(task.get_priority());
            System.out.println(task.get_status());
            System.out.println();
        }
    }

}
// at this point ToDoList can :
// 1. create an empty list
// 2. Accept Task Objects
// 3. Store those Task Objects
