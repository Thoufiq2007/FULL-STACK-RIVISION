package Day4;

import java.util.ArrayList;

public class D4T1 {
  public static void main(String[] args) {
    ArrayList<String> al= new ArrayList<>();
    al.add("kishore");
    al.add("madhan");
    al.add("kishu");
    al.add("yuga");
    al.add("damu");
    al.add("anil");
    al.add("kummar");
    al.add("tejesh");
    al.add("adhil");
    al.add("sagar");
    al.add("ajay");
    System.out.println(al);
    al.remove("anil");
    System.out.println(al);
    al.set(0,"sukumar");
    System.out.println(al);
    System.out.println(al.contains("tejesh"));
    System.out.println(al.size());


  }
  
}
