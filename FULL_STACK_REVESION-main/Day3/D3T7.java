package Day3;
class CharacterFinder{
  String word="programming";

}
public class D3T7 {
  public static void main(String[] args) {
    CharacterFinder obj = new CharacterFinder();
    System.out.println(obj.word.indexOf('c'));
    System.out.println(obj.word.indexOf('m'));
    System.out.println(obj.word.contains("z"));

  }
  
}
