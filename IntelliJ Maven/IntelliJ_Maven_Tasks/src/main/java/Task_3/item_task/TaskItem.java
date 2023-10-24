package Task_3.item_task;

import Task_3.enums.enums;

public class TaskItem {
    private int taskId;
    private String taskDescription;
    private enums status;

    public TaskItem(int taskId, String taskDescription, enums lol){
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.status = lol;
    }

    public int getTaskId(){return this.taskId;}
    public void setTaksId(int taskId){this.taskId = taskId;}
    public String getTaskDesc(){return this.taskDescription;}
    public void setTaskDesc(String TaskDesc){this.taskDescription = TaskDesc;}
    public enums GetStatus(){return this.status;}
    public void setStatus(enums status){this.status = status;}
}
