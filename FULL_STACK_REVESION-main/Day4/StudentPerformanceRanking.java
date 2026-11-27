package Day4;

import java.util.*;

public class StudentPerformanceRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> students = new HashMap<>();
        TreeSet<Integer> uniqueMarks = new TreeSet<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students.put(name, marks);
            uniqueMarks.add(marks);
        }

       
        System.out.println("\nStudent Marks:");
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

      
        System.out.println("\nHighest Marks: " + uniqueMarks.last());
        System.out.println("Lowest Marks: " + uniqueMarks.first());

       
        System.out.println("\nUnique Marks (Ascending):");
        for (int mark : uniqueMarks) {
            System.out.print(mark + " ");
        }

  
        System.out.println("\n\nStudents Scoring Above 80:");
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() > 80) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        
        int total = 0;
        for (int mark : students.values()) {
            total += mark;
        }

        double average = (double) total / students.size();
        System.out.println("\nClass Average: " + average);

     
        int highest = uniqueMarks.last();
        System.out.println("\nTop Performer(s):");
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() == highest) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        int pass = 0;
        int fail = 0;

        for (int mark : students.values()) {
            if (mark >= 35) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("\nPassed Students: " + pass);
        System.out.println("Failed Students: " + fail);

        sc.close();
    }
}