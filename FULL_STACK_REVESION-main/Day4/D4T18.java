package Day4;

import java.util.TreeMap;

public class D4T18 {
  public static void main(String[] args) {
    TreeMap<Integer,Integer> exam=new TreeMap<>();
    exam.put(101,22);
    exam.put(102,33);
    exam.put(103,44);
    exam.put(104,24);
    exam.put(105,100);
    System.out.println(exam);
    exam.put(101, 108);
    System.out.println(exam);
    int highest=0;
    int lowest=exam.firstKey();
    for(Integer key:exam.keySet()){
      if(exam.get(key)>highest){
        highest=exam.get(key);
      }
      if(exam.get(key)<lowest){
        lowest=exam.get(key);
      }
    }
    System.out.println("highest marks:"+highest);
    System.out.println("lowest marks:"+lowest);
    System.out.println(exam.firstEntry());
    System.out.println(exam.lastEntry());
    System.out.println(exam.subMap(103, 104));
    System.out.println(exam.descendingMap());
    System.out.println(exam.firstKey());
    System.out.println(exam);

  }
  
}
