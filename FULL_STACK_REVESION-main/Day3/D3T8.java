package Day3;
class WordAnalyzer{
  String word="banana";

}
public class D3T8 {
  public static void main(String[] args) {
    WordAnalyzer obj = new WordAnalyzer();
    System.out.println(obj.word.lastIndexOf('a')==obj.word.indexOf('a'));
    System.out.println(obj.word.lastIndexOf('n')==obj.word.indexOf('n'));
   
  }
}
