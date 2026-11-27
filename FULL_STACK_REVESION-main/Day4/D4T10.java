package Day4;

import java.util.Collection;
import java.util.TreeSet;

public class D4T10 {
  public static void main(String[] args) {
    TreeSet<Integer> sc= new TreeSet<>();
    sc.add(10);
    sc.add(20);
    sc.add(30);
    sc.add(40);
    sc.add(50);
    sc.add(60);
    sc.add(70);
    System.out.println(sc);
    System.out.println(sc.higher(60));
    System.out.println(sc.lower(40));
    System.out.println(sc.descendingSet());

  }
  
}
