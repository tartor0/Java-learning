package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Student Management Menu =====");
            System.out.println("1. List of Students");
            System.out.println("2. Get a specific Student by ID");
            System.out.println("3. Get Students by Gender");
            System.out.println("4. Update a specific Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> {
                    if (studentsList.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\n===== Students List =====");
                        for (Student s : studentsList) {
                            System.out.println(s.studentInfo());
                        }
                    }
                }

                case 2 -> {
                    System.out.print("Enter Student ID: ");
                    long id = input.nextLong();
                    input.nextLine();

                    Student found = null;
                    for (Student s : studentsList) {
                        if (s.id == id) {
                            found = s;
                            break;
                        }
                    }
                    if (found != null) {
                        System.out.println(found.studentInfo());
                    } else {
                        System.out.println("Student not found.");
                    }
                }

                case 3 -> {
                    System.out.print("Enter Gender (MALE/FEMALE/OTHER): ");
                    String genderStr = input.nextLine().toUpperCase();
                    Gender gender = Gender.valueOf(genderStr);

                    System.out.println("\n===== Students by Gender: " + gender + " =====");
                    for (Student s : studentsList) {
                        if (s.gender == gender) {
                            System.out.println(s.studentInfo());
                        }
                    }
                }

                case 4 -> {
                    System.out.print("Enter Student ID to update: ");
                    long id = input.nextLong();
                    input.nextLine();

                    Student found = null;
                    for (Student s : studentsList) {
                        if (s.id == id) {
                            found = s;
                            break;
                        }
                    }

                    if (found != null) {
                        System.out.print("Enter new First Name: ");
                        found.firstName = input.nextLine();
                        System.out.print("Enter new Last Name: ");
                        found.lastName = input.nextLine();
                        System.out.print("Enter new Stack: ");
                        found.stack = input.nextLine();
                        System.out.print("Enter new Gender (MALE/FEMALE/OTHER): ");
                        found.gender = Gender.valueOf(input.nextLine().toUpperCase());

                        System.out.println("✅ Student updated successfully!");
                    } else {
                        System.out.println("Student not found.");
                    }
                }

                case 5 -> {
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                }

                default -> System.out.println("Invalid choice. Try again.");
            }

            // Prompt to add student if empty
            if (studentsList.isEmpty()) {
                System.out.println("\n(No students yet. Let's add one!)");
                System.out.print("First Name: ");
                String first = input.nextLine();
                System.out.print("Last Name: ");
                String last = input.nextLine();
                System.out.print("Stack: ");
                String stack = input.nextLine();
                System.out.print("Gender (MALE/FEMALE/OTHER): ");
                Gender gender = Gender.valueOf(input.nextLine().toUpperCase());

                studentsList.add(new Student(first, last, stack, gender));
                System.out.println("✅ Student added successfully!");
            }
        }
    }
}
