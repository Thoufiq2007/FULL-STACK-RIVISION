package Day3;

import java.util.LinkedList;

public class LList {
  public static void main(String[] args) {
    LinkedList <Integer> li=new LinkedList<Integer>();
    li.add(99);
    li.add(11);
    li.add(44);
    li.add(33);
    System.out.println(li);
    li.remove();
    li.removeFirst();
    li.removeLast();
    System.out.println(li);
    
  }
}
