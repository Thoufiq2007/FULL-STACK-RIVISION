package Day4;

import java.util.LinkedHashSet;

public class D4T12 {
  public static void main(String[] args) {
    LinkedHashSet<Integer> vid=new LinkedHashSet<>();
    vid.add(101);
    vid.add(102);
    vid.add(103);
    vid.add(104);
    vid.add(105);
    vid.add(106);
    vid.add(107);
    vid.add(108);
    vid.add(109);
    System.out.println(vid);
    System.out.println(vid.contains(104));
    System.out.println(vid.size());
    vid.remove(109);
    System.out.println(vid);

  }
  
}
