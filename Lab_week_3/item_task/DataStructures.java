package Lab_week_3.item_task;
import Lab_week_3.item_task.TaskItem;
import Lab_week_3.enums.enums;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();


    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", enums.TO_DO),
                new TaskItem(2,"Prepare for the quiz", enums.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", enums.COMPLETED)
        );
    }


    public List<TaskItem> getAllObjects() {
        return this.tasks;
    }
    public List<TaskItem> getByStatus(enums status){
        return tasks.
                    stream().
                    filter(s -> s.GetStatus().equals(status)).
                    collect(Collectors.toList());
    }

    public List<TaskItem> taskIdGreaterOrEqualByTwo() {
    return tasks.
                stream().
                filter(t -> t.getTaskId() >= 2).
                collect(Collectors.toList());
    }
    public void printTaskDescription() {
        tasks.stream().
                    forEach(taskItem -> {
                        System.out.println(" - " + taskItem.getTaskDesc());
                    });
    }
}