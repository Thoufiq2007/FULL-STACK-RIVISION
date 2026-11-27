package Day4;

import java.util.LinkedList;

public class D4T4 {
  public static void main(String[] args) {
    LinkedList<String> song = new LinkedList<>();
   song.add("song1");
   song.add("song2");
   song.add("song3");
   song.add("song4");

   System.out.println(song);

   song.removeFirst();
   System.out.println(song);

   song.removeLast();
   System.out.println(song);

   System.out.println(song);

   System.out.println("cuurent first song:"+song.getFirst());
   System.out.println("current Last song:"+song.getLast());

   System.out.println(song.contains("song3"));

    for(String k:song){
      System.out.println("song playing..."+k);
      song.removeFirst();
     
      

    }
   
   
  }
  
}
