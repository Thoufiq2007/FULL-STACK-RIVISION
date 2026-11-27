package Day4;

import java.util.HashSet;

public class D4T8 {
  public static void main(String[] args) {
    HashSet<String> pi=new HashSet<>();
    pi.add("laptop");
    pi.add("desktop");
    pi.add("mobile");
    pi.add("Headphones");
    pi.add("buds");
    pi.add("buds");
    System.out.println(pi);
    pi.remove("mobile");
    System.out.println(pi.contains("Headphones"));
    System.out.println(pi);

  }
}
