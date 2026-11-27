package Day4;

import java.util.HashMap;

public class D4T15 {
  public static void main(String[] args) {
    HashMap<Integer,Integer>pi=new HashMap<>();
    pi.put(101,2);
    pi.put(102,3);
    pi.put(103,4);
    pi.put(104,2);
    pi.put(105,1);
    System.out.println(pi.get(101));
    System.out.println(pi);
    System.out.println(pi.getOrDefault(104,5));
    System.out.println(pi.entrySet());
    for(Integer k:pi.keySet()){
      if(pi.get(k)<5){
        System.out.println(k);
      }
      if(pi.get(k)<0){
        pi.remove(k);
      }
    }
    System.out.println(pi.entrySet());
  }
  
}
