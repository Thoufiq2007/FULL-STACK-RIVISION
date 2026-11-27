package Day4;

import java.util.HashSet;

public class D3T23 {
  public static void main(String[] args) {
    HashSet<Integer> re= new HashSet<>();
    HashSet<Integer>re1= new HashSet<>();
    re.add(99);
    re.add(34);
    re.add(34);
    re.add(45);
    re.add(99);
    System.out.println(re);
    System.out.println(re.contains(34));
    re1.add(43);
    re1.add(34);
    re1.add(23);
    re1.add(24);
    
    System.out.println(re);
    // re.retainAll(re1); //similar
    re.addAll(re1);
    System.out.println(re);
    
  }

  
}
