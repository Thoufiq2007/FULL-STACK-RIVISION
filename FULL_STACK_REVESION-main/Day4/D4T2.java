package Day4;

import java.util.ArrayList;

public class D4T2 {
  public static void main(String[] args) {
    ArrayList<String> cart=new ArrayList<>();
     ArrayList<Integer> quantity=new ArrayList<>();
    cart.add("Mobile");
    quantity.add(1);
    cart.add("laptop");
     quantity.add(2);
    cart.add("book");
     quantity.add(3);
    cart.add("stickers");
     quantity.add(4);
    cart.add("Pouch");
     quantity.add(5);
    cart.add("Biscuts");
     quantity.add(6);
    for(int i=0;i<cart.size();i++){
      System.out.println(cart.get(i)+" : "+quantity.get(i));
    }
    int index=cart.indexOf("Pouch");

    if(index!=-1){
      quantity.remove(index);
      cart.remove(index);
    }
    index=cart.indexOf("laptop");
    if(index != -1){
      quantity.set(index,10);
    }
    System.out.println("Upadted cart");
     for(int i=0;i<cart.size();i++){
      System.out.println(cart.get(i)+" : "+quantity.get(i));
    }
    System.out.println(cart.contains("laptop"));
    System.out.println(cart.size());
    cart.clear();
  }
  
}
