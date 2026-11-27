package Day3;

import java.io.FileReader;

public class throwsKeyword {
  public static void OpenFile() throws Exception{
    try (FileReader obj = new FileReader("index.txt")) {
      obj.read();
    }
  }
  public static void main(String[] args) {
    try{
      OpenFile();
    }catch(Exception e){
      System.out.println("error found wile opening"+e);
    }
  }
  
}
