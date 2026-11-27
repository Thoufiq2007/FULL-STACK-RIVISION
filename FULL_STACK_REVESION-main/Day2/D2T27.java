interface Playable{
  void  playMedia();
}
interface Downloadable{
  void downloadMedia();
}
class MusicPlayer implements Playable,Downloadable{
  public void  playMedia() {
    System.out.println("Playing music...");
  }
  public void  downloadMedia(){
    System.out.println("Downloading music...");
  }

}
public class D2T27 {
  public static void main(String[] args) {
    MusicPlayer obj = new MusicPlayer();
    obj.playMedia();
    obj.downloadMedia();

  }
  
}
