package Day4;

import java.util.LinkedHashMap;

public class D3T20{
  public static void main(String[] args) {
    LinkedHashMap<String,Integer> dsm=new LinkedHashMap<>();
    dsm.put("Laptop", 24);
    dsm.put("Mobile", 32);
    dsm.put("Door", 32);
    dsm.put("Fan", 2);
    dsm.put("Ac", 3);
    dsm.put("Books", 4);
    System.out.println(dsm);
    dsm.put("Ac", 33);
    System.out.println(dsm);
    System.out.println(dsm.entrySet());
    System.out.println(dsm.values());
    int highest=0;
    int total=0;
    String temp="";

    for(String key:dsm.keySet()){
      if(dsm.get(key)>highest){
        highest=dsm.get(key);
        temp=key;
      }
      total +=dsm.get(key);
    }
    System.out.println("total Quantity of goods sold:"+total);
    System.out.println("highest sales quantity"+dsm.get(temp));



  }
}