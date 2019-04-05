package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Student student) {
        int size = student.getTasks().size();
        String suffix = size > 1 ? "s" : "";
        System.out.println(mentorName + ": there is new task to check from: " + student.getStudentName() + "\n" +
                " (total: " + size + " task" + suffix + ")");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
