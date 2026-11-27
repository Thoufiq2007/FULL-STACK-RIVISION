package Day3;

import java.util.HashMap;

public class Hmap {
  public static void main(String[] args) {
    HashMap<Integer,String> hm=new HashMap<>();
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
