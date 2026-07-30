import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String []args){
        
        try{

            Scanner sc=new Scanner(System.in);
            
            ArrayList<Task> todoList=new ArrayList<>();

            while(true){

                System.out.println(
                    "Press 1 to add a task, "+
                    "\n2 to view all the tasks "+
                    "\n3 to change status of tasks"+
                    "\n4 to delete a task"+
                    "\nAny other key to exit");

                String userAction= sc.nextLine();
                
                if(userAction.equals("1")){

                    System.out.println("Enter The Task");
                    String taskStr = sc.nextLine();

                    System.out.println("Enter Priority - 1 Low, 2 Medium, 3 High ");
                    int priority=Integer.parseInt(sc.nextLine());

                    priority=priority >3 ? 1:priority;


                    todoList.add(new Task(taskStr,priority));
                    System.out.println("The task has been added to the list");

                }
                else if(userAction.equals("2")){
                    todoList.forEach(task -> System.out.println(task));
                }

                else if(userAction.equals("3")){

                    System.out.println("Enter the index of the status ypu want to change");
                    int chgIdx=Integer.parseInt(sc.nextLine());

                    if(chgIdx>(todoList.size()-1)){
                        System.out.println("There is not such index position in the list");
                    }
                    else{

                        System.out.println("Emter the new status fot the tadk P for 'in progress' or C for 'completed'");
                        String updatedStatus =sc.nextLine();

                        if(updatedStatus.equalsIgnoreCase("P")){
                            todoList.get(chgIdx).setStatus(Task.IN_PROGRESS);
                        }
                        else if(updatedStatus.equalsIgnoreCase("C")){
                            todoList.get(chgIdx).setStatus(Task.COMPLETED);
                        }
                    }
                    System.out.println("The task has been changed in the list");
                }
                else if(userAction.equals("4")){

                    System.out.println("Enter the index of the status you want to delete");

                    int rmvIdx=Integer.parseInt(sc.nextLine());

                    if(rmvIdx>(todoList.size()-1)){
                        System.out.println("There is no such index position in the list");
                    }
                    else{
                        todoList.remove(rmvIdx);
                        System.out.println("The task has been removed fromt the list");
                    }
                }
                else{
                    break;
                }
            }
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid input.Please enter a valid number");
        }
    }
    
}
