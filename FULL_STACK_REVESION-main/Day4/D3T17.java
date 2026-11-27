package Day4;

import java.util.TreeMap;

public class D3T17 {
  public static void main(String[] args) {
    TreeMap<Integer,String > sdb= new TreeMap<>();
    sdb.put(105,"kishu");
    sdb.put(102,"yuva");
    sdb.put(103,"teju");
    sdb.put(104,"vyshu");
    sdb.put(101,"aishu");
    System.out.println(sdb);
    sdb.put(101,"shreya");
    System.out.println(sdb);
    sdb.remove(104);
    System.out.println(sdb);
    System.out.println(sdb.descendingKeySet());
    for(Integer k:sdb.descendingKeySet()){
      System.out.println(sdb.get(k));
    }
    System.out.println(sdb.descendingMap());
    System.out.println(sdb.subMap(101, 103));
  }
  
}
