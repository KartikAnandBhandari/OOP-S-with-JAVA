abstract class Playable{
   void play()       //concrete method
   {
    System.out.println("Music is playing");
}
    abstract void pause();
    abstract void stop();

}
class MusicPlayer extends Playable{

@Override
public  void pause(){
    System.out.println("Music is paused....");
}
@Override
public void stop(){
    System.out.println("Music is paused");
}
}
public class TestPlayer{
    public static void main(String[] args) {
        MusicPlayer obj= new MusicPlayer();
        obj.play();
        obj.pause();
        obj.stop();

    }
}