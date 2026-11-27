package Day4;

import java.util.HashMap;

public class D4T13 {
  public static void main(String[] args) {
    HashMap<String,Integer> mm=new HashMap<>();
     mm.put("kishore",99);
     mm.put("anil",90);
     mm.put("shiva",56);
     mm.put("loka",88);
     mm.put("madhan",77);
     mm.put("yuva",87);
     mm.put("rudhra",88);
     System.out.println(mm);
     System.out.println(mm.get("kishore"));
     mm.remove("anil");
     System.out.println(mm);
     System.out.println(mm.containsKey("yuva"));
     System.out.println(mm.keySet());
     System.out.println(mm.values());
  }
  
}
