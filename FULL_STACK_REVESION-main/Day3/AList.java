package Day3;

import java.util.ArrayList;

public class AList {
  public static void main(String[] args) {
    ArrayList <Integer> nums=new ArrayList<Integer>();
    nums.add(20);
    nums.add(30);
    nums.add(10);
    nums.add(40);
    nums.add(20);
    System.out.println(nums);
    nums.remove(0);
    System.out.println(nums);
  }
}
