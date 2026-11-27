package Day4;

import java.util.TreeSet;

public class D4T9 {
  public static void main(String[] args) {
    TreeSet<Integer> id = new TreeSet<>();
       id.add(01);
    id.add(02);
    id.add(03);
    id.add(5);
    id.add(04);
    id.add(06);
    id.add(07);
    id.add(9);
    System.out.println(id );
    id.remove(9);
    System.out.println(id.first());
    System.out.println(id.last());
    System.out.println(id.higher(05));
    System.out.println(id.lower(03));
    System.out.println(id.headSet(07));
    System.out.println(id.tailSet(3));
    System.out.println(id.subSet(3, 7));



  }
  
}
