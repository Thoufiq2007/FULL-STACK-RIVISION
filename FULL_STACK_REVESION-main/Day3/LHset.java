package Day3;

import java.util.LinkedHashSet;

public class LHset {
  public static void main(String[] args) {
    LinkedHashSet<String> courses=new LinkedHashSet<>();
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
