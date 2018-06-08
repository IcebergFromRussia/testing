package com.untitled.tests.entities;

public class TaskData {
    /**
     *  название таска
     */
    private String taskName;

    public TaskData(String taskName){
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }
}
