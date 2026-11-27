package Day4;

import java.util.LinkedHashMap;

public class D4T28 {
  public static void main(String[] args) {
    LinkedHashMap <Integer,String> ot= new LinkedHashMap<>();
    ot.put(101,"preparing");
    ot.put(102, "Packed");
    ot.put(103,"Out for delivery");
    ot.put(104,"Delivered");
    System.out.println(ot.get(101));
    ot.remove(104);
    System.out.println(ot);
    System.out.println(ot.containsKey(103));
    System.out.println(ot.entrySet());
    System.out.println(ot.getOrDefault(107, "getting son"));

  }
  
}
