package Day4;

import java.util.LinkedHashSet;

public class D4T11 {
  public static void main(String[] args) {
    LinkedHashSet<String> con=new LinkedHashSet<>();
    con.add("kishore");
    con.add("madhan");
    con.add("anil");
    con.add("sumitra");
    con.add("sujatha");
    con.add("chaithu");
    con.add("swathi");
    System.out.println(con);
    con.remove("anil");
    System.out.println(con);
    System.out.println(con.contains("sumitra"));

  }
  
}
