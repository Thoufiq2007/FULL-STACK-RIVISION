package Day3;
class TextEditor{
  String sentence="i love python programming";

}
public class D3T10 {
  public static void main(String[] args) {
    TextEditor obj = new TextEditor();
    System.out.println(obj.sentence);
    System.out.println(obj.sentence.replace("python", "java "));
    System.out.println(obj.sentence.replaceAll("o", "0"));
  }
  
}
