package ru.job4j.search;

public class Task {
    private String desc;
    private int priority;

    public Task(int priority, String desc) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }
}
