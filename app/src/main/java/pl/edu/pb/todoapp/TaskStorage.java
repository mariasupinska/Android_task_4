package pl.edu.pb.todoapp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();
    private final List<Task> tasks;

    private TaskStorage() {
        tasks = new ArrayList<>();
        for ( int i = 1; i <= 123; i++ ) {
            Task task = new Task();
            task.setName("Pilne zadanie numer " + i);
            if ( i % 3 == 0 ) {
                task.setCategory(Category.UNIVERSITY);
            } else {
                task.setCategory(Category.HOME);
            }
            task.setDone(i % 3 == 0);
            tasks.add(task);
        }
    }


    public static TaskStorage getInstance() {
        return taskStorage;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Task getTask(UUID taskId) {
        for(Task task:tasks) {
            if ( task.getId().equals(taskId) ) {
                return task;
            }
        }
        return null;
    }
}
