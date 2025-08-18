package org.example;

public class Student {
    private static long counter = 1; // auto-increment ID

    public long id;
    public String firstName;
    public String lastName;
    public String stack;
    public Gender gender;

    public Student(String firstName, String lastName, String stack, Gender gender) {
        this.id = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.stack = stack;
        this.gender = gender;
    }

    public String studentInfo() {
        return String.format("ID: %d | Name: %s %s | Stack: %s | Gender: %s",
                id, firstName, lastName, stack, gender);
    }
}
