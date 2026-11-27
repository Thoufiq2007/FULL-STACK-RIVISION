package Day4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class D4T6 {
  public static void main(String[] args) {
    ArrayList<Integer> price=new ArrayList<>();
    Scanner sc= new Scanner(System.in);

   int highest=0;
   int lowest=0;
   int sum=0;

    price.add(100);
     price.add(200);
      price.add(300);
       price.add(400);
     price.add(500);
      price.add(600);
       price.add(700);
     price.add(800);
      price.add(900);
       price.add(1000);

       System.out.println("all prices:"+price);
       System.out.println("ENter index to update prize:");
       int index=sc.nextInt();
       System.out.println("Enter the new prize");
       int updatedPrize = sc.nextInt();
       price.set(index, updatedPrize);

        lowest=price.getFirst();
       for(Integer k:price){
          if(highest<k){
            highest=k;
          }
          if(lowest>k){
            lowest=k;
          }
          sum +=k;
       }

       System.out.println("Highest Price :"+highest);
       System.out.println("Lowest Price  :"+lowest);
       System.out.println("Verage Price :"+sum/price.size());


       Collections.sort(price);
       System.out.println(price);
       System.out.println(Collections.min(price));
       System.out.println(Collections.max(price));

  }
  
}
