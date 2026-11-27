package Day4;

import java.util.LinkedList;

public class D3T22 {
  public static void main(String[] args) {
    LinkedList<String> cs=new LinkedList<>();
    cs.add("kishore");
    cs.add("kishu");
    cs.add("ammu");
    cs.add("teju");
    System.out.println(cs);
    cs.addFirst("janu");
    cs.addLast("ammu");
    System.out.println(cs);
    System.out.println(cs.peek());
    System.out.println(cs.poll());
    System.out.println(cs.remove());
    cs.remove("ammu");
    System.out.println(cs.size());
    System.out.println(cs.isEmpty());
    System.out.println(cs);

  }
  
}
