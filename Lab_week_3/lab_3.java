/*
In this task, your goal is to create a Java program that exemplifies object-oriented programming principles by implementing 
a Task Management System. Your task is to design a class named TaskItem which should have three attributes: taskId (an integer 
representing a unique identifier for each task), taskDescription (a string describing the task), and taskStatus (an enum 
representing the status of the task with values such as TO_DO, IN_PROGRESS, COMPLETED, and CANCELLED). 
 */
package Lab_week_3;
import Lab_week_3.item_task.DataStructures;
import Lab_week_3.item_task.TaskItem;
import Lab_week_3.enums.enums;

/* 
import java.sql.SQLException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
*/

public class lab_3{
    public static void main(){
        DataStructures lol = new DataStructures();
    }
}

/* 
public class lab_3{
    public static void main(String[] args) throws SQLException {
        System.out.println();
        Scanner reader = new Scanner(System.in);

        DataStructures dt = new DataStructures();

        List<TaskItem> taskItems = dt.getAllObjects();

        System.out.println( "Printing all Objects..." );

        int i = 1;
        for(TaskItem ti : taskItems) {
            System.out.print( "Object" + i + ": " + ti + ", ");
            System.out.println("ID: " +  ti.getTaskId()  + ", Task Description: "  + ti.getTaskDescription() + ", Task Status: "  + ti.GetStatus());
            i++;
        }

        System.out.println();

        Status status = Status.values()[new Random().nextInt(Status.values().length)]; // gets a random value from Status
        System.out.println("Printing all Task Statuses with status: " + status );

        List<TaskItem> filteredTasks = dt.getByStatus(status);
        for(TaskItem ti : filteredTasks) {
            System.out.println("Task Status: " +  ti.GetStatus() + ", " + "Task Description: " + ti.getTaskDescription());
        }

        System.out.println();

        System.out.println("Printing all Tasks with " + "ID" + " >= 2");
        List<TaskItem> greaterOrEqualTwo = dt.taskIdGreaterOrEqualByTwo();
        for(TaskItem ti : greaterOrEqualTwo) {
            System.out.println("ID: " + ti.getTaskId() + ", Task Description: " + ti.getTaskDescription());
        }

        System.out.println();

        System.out.println("Printing " + "Task Descriptions...");
        dt.printTaskDescription();

        System.out.println();

        System.out.print("Do you wish to connect to the Database?(y / n)?: ");
        String answer = reader.nextLine();

        System.out.println();

        if(answer.equals("y")) {
            Database db = new Database();
            System.out.println();
            db.getAllTask();

            System.out.println();

            System.out.print("Enter task ID: ");
            int taskId = Integer.parseInt(reader.nextLine());

            db.getTaskbyID(taskId);
        } else {
            System.out.println("OK, bye!");
        }
    }
}
*/