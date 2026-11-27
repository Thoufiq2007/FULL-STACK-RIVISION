package Day3;

import java.util.TreeSet;

public class Tset {
  public static void main(String[] args) {
    TreeSet<String> courses=new TreeSet<>();
    courses.add("java");
    courses.add("html");
    courses.add("python");
    courses.add("react");
   System.out.println(courses);
   System.out.println(courses.contains("java"));
   courses.remove("python");
   System.out.println(courses);


  }
}
