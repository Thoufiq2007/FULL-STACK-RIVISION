import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> studentNames = new ArrayList<>();
    static ArrayList<Integer> studentIds = new ArrayList<>();
    static ArrayList<Integer> studentMarks = new ArrayList<>();

    static LinkedList<String> attendance = new LinkedList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        while (true) {

            System.out.println("\n====================================");
            System.out.println("       STUDENT MANAGEMENT SYSTEM");
            System.out.println("====================================");

            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Remove Student");
            System.out.println("6. Add Student Attendance");
            System.out.println("7. Display Attendance");
            System.out.println("8. Remove Attendance");
            System.out.println("9. Display Student Statistics");
            System.out.println("10. Sort Student Names");
            System.out.println("11. Search Attendance");
            System.out.println("12. Count Attendance");
            System.out.println("13. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudentMarks();
                    break;

                case 5:
                    removeStudent();
                    break;

                case 6:
                    addAttendance();
                    break;

                case 7:
                    displayAttendance();
                    break;

                case 8:
                    removeAttendance();
                    break;

                case 9:
                    displayStatistics();
                    break;

                case 10:
                    sortStudentNames();
                    break;

                case 11:
                    searchAttendance();
                    break;

                case 12:
                    countAttendance();
                    break;

                case 13:
                    System.out.println("Thank you for using Student Management System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }

    public static void addStudent() {

        System.out.println("========== ADD STUDENT ==========");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        if (studentIds.contains(id)) {
            System.out.println("Student ID already exists!");
            return;
        }

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        if (name.trim().isEmpty()) {
            System.out.println("Student name cannot be empty!");
            return;
        }

        System.out.print("Enter Student Marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks! Enter marks between 0 and 100.");
            return;
        }

        studentIds.add(id);
        studentNames.add(name);
        studentMarks.add(marks);

        System.out.println("Student Added Successfully!");
    }

    public static void displayStudents() {

        System.out.println("========== ALL STUDENTS ==========");

        if (studentNames.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        System.out.println("ID\tName\tMarks");

        for (int i = 0; i < studentNames.size(); i++) {

            System.out.println(
                studentIds.get(i) + "\t" +
                studentNames.get(i) + "\t" +
                studentMarks.get(i)
            );
        }

        System.out.println("--------------------------------");

        System.out.println("Total Students: " + studentNames.size());
    }

    public static void searchStudent() {

        System.out.println("========== SEARCH STUDENT ==========");

        System.out.print("Enter Student Name: ");
        sc.nextLine();

        String name = sc.nextLine();

        int index = studentNames.indexOf(name);

        if (index == -1) {
            System.out.println("Student Not Found!");
            return;
        }

        System.out.println("Student Found!");

        System.out.println("Student ID: " + studentIds.get(index));
        System.out.println("Student Name: " + studentNames.get(index));
        System.out.println("Student Marks: " + studentMarks.get(index));
    }

    public static void updateStudentMarks() {

        System.out.println("========== UPDATE STUDENT MARKS ==========");

        System.out.print("Enter Student Name: ");
        sc.nextLine();

        String name = sc.nextLine();

        int index = studentNames.indexOf(name);

        if (index == -1) {
            System.out.println("Student Not Found!");
            return;
        }

        System.out.println("Current Marks: " + studentMarks.get(index));

        System.out.print("Enter New Marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks! Enter marks between 0 and 100.");
            return;
        }

        studentMarks.set(index, marks);

        System.out.println("Student Marks Updated Successfully!");

        System.out.println("Updated Marks: " + studentMarks.get(index));
    }

    public static void removeStudent() {

        System.out.println("========== REMOVE STUDENT ==========");

        System.out.print("Enter Student Name: ");
        sc.nextLine();

        String name = sc.nextLine();

        int index = studentNames.indexOf(name);

        if (index == -1) {
            System.out.println("Student Not Found!");
            return;
        }

        studentNames.remove(index);
        studentIds.remove(index);
        studentMarks.remove(index);

        System.out.println("Student Removed Successfully!");

        displayStudents();
    }

    public static void addAttendance() {

        System.out.println("========== ADD ATTENDANCE ==========");

        System.out.print("Enter Student Name: ");
        sc.nextLine();

        String name = sc.nextLine();

        if (!studentNames.contains(name)) {
            System.out.println("Student is not registered!");
            return;
        }

        System.out.println("1. Add at Beginning");
        System.out.println("2. Add at Ending");

        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            attendance.addFirst(name);

            System.out.println("Attendance Added at Beginning!");

        } else if (choice == 2) {

            attendance.addLast(name);

            System.out.println("Attendance Added at Ending!");

        } else {

            System.out.println("Invalid Choice!");
        }
    }

    public static void displayAttendance() {

        System.out.println("========== STUDENT ATTENDANCE ==========");

        if (attendance.isEmpty()) {
            System.out.println("No Attendance Records Found!");
            return;
        }

        for (int i = 0; i < attendance.size(); i++) {

            System.out.println((i + 1) + ". " + attendance.get(i));
        }

        System.out.println("--------------------------------");

        System.out.println("Total Attendance: " + attendance.size());
    }

    public static void removeAttendance() {

        System.out.println("========== REMOVE ATTENDANCE ==========");

        if (attendance.isEmpty()) {
            System.out.println("No Attendance Records Found!");
            return;
        }

        System.out.print("Enter Student Name to Remove: ");
        sc.nextLine();

        String name = sc.nextLine();

        if (attendance.contains(name)) {

            attendance.remove(name);

            System.out.println("Attendance Removed Successfully!");

        } else {

            System.out.println("Attendance Not Found!");
        }
    }

    public static void searchAttendance() {

        System.out.println("========== SEARCH ATTENDANCE ==========");

        System.out.print("Enter Student Name: ");
        sc.nextLine();

        String name = sc.nextLine();

        if (attendance.contains(name)) {

            System.out.println("Student Found in Attendance!");

        } else {

            System.out.println("Student Not Found in Attendance!");
        }
    }

    public static void countAttendance() {

        System.out.println("========== COUNT ATTENDANCE ==========");

        System.out.println("Total Present Students: " + attendance.size());
    }

    public static void displayStatistics() {

        System.out.println("========== STUDENT STATISTICS ==========");

        if (studentMarks.isEmpty()) {
            System.out.println("No Students Available!");
            return;
        }

        System.out.println("Total Students: " + studentMarks.size());

        int highest = Collections.max(studentMarks);

        System.out.println("Highest Marks: " + highest);

        int lowest = Collections.min(studentMarks);

        System.out.println("Lowest Marks: " + lowest);

        int total = 0;

        for (int marks : studentMarks) {
            total += marks;
        }

        double average = (double) total / studentMarks.size();

        System.out.println("Average Marks: " + average);

        int count = 0;

        for (int marks : studentMarks) {

            if (marks > 75) {
                count++;
            }
        }

        System.out.println("Students Scoring Above 75: " + count);
    }

    public static void sortStudentNames() {

        System.out.println("========== SORT STUDENT NAMES ==========");

        if (studentNames.isEmpty()) {
            System.out.println("No Students Available!");
            return;
        }

        System.out.println("1. Alphabetical Order");
        System.out.println("2. Reverse Order");

        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();

        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < studentNames.size(); i++) {
            indexes.add(i);
        }

        Collections.sort(indexes, (a, b) ->
            studentNames.get(a).compareToIgnoreCase(studentNames.get(b))
        );

        if (choice == 2) {

            Collections.reverse(indexes);

        } else if (choice != 1) {

            System.out.println("Invalid Choice!");
            return;
        }

        ArrayList<String> sortedNames = new ArrayList<>();
        ArrayList<Integer> sortedIds = new ArrayList<>();
        ArrayList<Integer> sortedMarks = new ArrayList<>();

        for (int index : indexes) {

            sortedNames.add(studentNames.get(index));
            sortedIds.add(studentIds.get(index));
            sortedMarks.add(studentMarks.get(index));
        }

        studentNames.clear();
        studentIds.clear();
        studentMarks.clear();

        studentNames.addAll(sortedNames);
        studentIds.addAll(sortedIds);
        studentMarks.addAll(sortedMarks);

        System.out.println("Student Records Sorted Successfully!");

        displayStudents();
    }
}