package Day4;

import java.util.HashSet;

public class D4T7 {
  public static void main(String[] args) {
    HashSet<Integer> id= new HashSet<>();
    id.add(01);
    id.add(02);
    id.add(03);
    id.add(04);
    id.add(05);
    id.add(06);
    id.add(07);
    id.add(9);
    System.out.println(id);
    id.remove(9);
    System.out.println(id);
    System.out.println(id.contains(01));
    System.out.println("Redisterd Students:"+id);
    System.out.println("total number of uniqElements:"+id.size());

    

  }
  
}
