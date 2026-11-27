package Day4;

import java.util.HashMap;

public class D4T16 {
  public static void main(String[] args) {
    HashMap<String,Integer> contact=new HashMap<>();
    contact.put("kishore", 9550);
     contact.put("yuva", 9551);
      contact.put("kishu", 9552);
       contact.put("dinesh", 9553);
       System.out.println(contact.get("kishu"));
       System.out.println(contact.containsKey("yuav"));
       contact.remove("dinesh");
      System.out.println(contact);

  }
}
