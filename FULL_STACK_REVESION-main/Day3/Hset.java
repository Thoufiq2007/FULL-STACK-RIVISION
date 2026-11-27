package Day3;

import java.util.HashSet;

public class Hset {
  public static void main(String[] args) {
    HashSet <String>courses = new HashSet<>();
    courses.add("java");
    courses.add("html");
    courses.add("python");
    courses.add("react");
    courses.add("java");
   System.out.println(courses);
   System.out.println(courses.contains("java"));
   courses.remove("python");
   System.out.println(courses);



  }
  
}
