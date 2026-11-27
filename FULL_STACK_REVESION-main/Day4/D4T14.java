package Day4;

import java.util.HashMap;

public class D4T14 {
  public static void main(String[] args) {
    HashMap<Integer,Integer>  es= new HashMap<>();
    es.put(101,1000);
     es.put(102,2000);
      es.put(103,5000);
      es.put(104,4000);
      es.put(105,5000);
      System.out.println(es);
      System.out.println(es.get(102));
      es.replace(101, 100000);
      System.out.println(es);
      System.out.println(es.entrySet());
      System.out.println(es.values());
      int maxSalary=0;
      int salaray=0;
      int total=0;
     for(Integer key:es.keySet()){
      if(es.get(key)>maxSalary){
        maxSalary=es.get(key);
        salaray=key;
      }
      total +=es.get(key);
     }
     System.out.println("max salary:"+maxSalary);
     System.out.println("Total Expendicture  :"+total);
  }
  
}
