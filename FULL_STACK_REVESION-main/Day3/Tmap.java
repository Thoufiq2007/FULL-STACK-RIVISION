package Day3;

import java.util.TreeMap;

public class Tmap {
  public static void main(String[] args) {
    TreeMap<Integer,String> hm=new TreeMap<>();
      hm.put(101, "kishu");
    hm.put(102, "alice");
    hm.put(103, "bob");
    hm.put(104, "anuska");
    hm.put(101, "damu");
    System.out.println(hm);
    System.out.println(hm.keySet());
    System.out.println(hm.get(101));
    hm.remove(101);
    System.out.println(hm);
  }
  
  
  
}
