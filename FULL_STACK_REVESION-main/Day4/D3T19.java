package Day4;

import java.util.LinkedHashMap;

public class D3T19 {
  public static void main(String[] args) {
    LinkedHashMap<Integer,String> ops=new LinkedHashMap<>();
    ops.put(101,"kishu");
    ops.put(106, "gnana");
    ops.put(102,"yuva");
    ops.put(103,"aishu");
    ops.put(104,"vyshu");
    ops.put(105,"Teju");
    System.out.println(ops);
    ops.put(105, "tejaswini");
    System.out.println(ops);
    ops.remove(104);
    System.out.println(ops.get(105));
    System.out.println(ops.containsKey(102));
    System.out.println(ops);


  }

  
}
