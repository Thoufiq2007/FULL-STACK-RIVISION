package Day4;

import java.util.ArrayList;
import java.util.Collections;

public class D3T21 {
  public static void main(String[] args) {
    ArrayList<String> lib=new ArrayList<>();
    lib.add("alex");
    lib.add("Ai");
    lib.add("java");
    lib.add("python resourse");
    lib.add("apple");
    System.out.println(lib);
    lib.remove("Ai");
    lib.set(1,"Water");
    System.out.println(lib.contains("apple"));
    System.out.println(lib.size());
    for(String k:lib){
      System.out.println("available book:"+k);
    }
    Collections.reverse(lib);
    System.out.println(lib);

  }
}
