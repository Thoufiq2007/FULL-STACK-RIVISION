package Day4;

import java.util.*;

public class D4T24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<String> skills = new TreeSet<>();

        
        skills.add("Java");
        skills.add("Python");
        skills.add("React");
        skills.add("SQL");
        skills.add("MongoDB");

        System.out.println("Initial Skills:");
        System.out.println(skills);

        System.out.print("\nEnter a new skill to add: ");
        String newSkill = sc.nextLine();

        if (skills.add(newSkill)) {
            System.out.println("Skill added successfully.");
        } else {
            System.out.println("Skill already exists!");
        }

        System.out.print("\nEnter a skill to remove: ");
        String removeSkill = sc.nextLine();

        if (skills.remove(removeSkill)) {
            System.out.println("Skill removed successfully.");
        } else {
            System.out.println("Skill not found.");
        }

        System.out.print("\nEnter a skill to search: ");
        String searchSkill = sc.nextLine();

        if (skills.contains(searchSkill)) {
            System.out.println("Skill is available.");
        } else {
            System.out.println("Skill is not available.");
        }

       
        System.out.println("\nSkills in Alphabetical Order:");
        for (String skill : skills) {
            System.out.println(skill);
        }

      
        System.out.println("\nFirst Skill: " + skills.first());
        System.out.println("Last Skill: " + skills.last());

       
        System.out.println("\nSkills in Descending Order:");
        for (String skill : skills.descendingSet()) {
            System.out.println(skill);
        }

        sc.close();
    }
}
