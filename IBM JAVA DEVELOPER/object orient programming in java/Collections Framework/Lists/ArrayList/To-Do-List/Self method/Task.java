// a CLASS NAMED task to show how task would look like
class Task {

    private int id;
    private String task_title;
    private String priority;
    private String status;

    // constructor so that the variables gets initialized when a object is created 
    // in other words when a task is created 
    public Task(int id, String task_title, String priority) {

        this.id = id;
        this.task_title = task_title;
        this.priority = priority;
        this.status = "Pending";

    }

    public int get_id(){
        return id;
    }

    public String get_task_title(){
        return task_title;
    }

    public String get_priority(){
        return priority;
    }

    public String get_status(){
        return status;
    }

    // status can only be updated by Task class 
    // because status is a private variable
    public void markCompleted(){
        status="Completed";
    }
    


}