import java.util.Scanner;

interface camera{
    void take_photo();
    void is_camera_on();
   default void is_camera_off(){
        System.out.println("Camera is off");
    }

}

interface music_player{
    void play_music();
    default 
    void stop_music(){
        System.out.println("Music stopped");
    }

}

class smartphone implements camera , music_player{
        public void is_camera_on(){
            System.out.println("Camera is on");
        }
    public void take_photo(){
        System.out.println("Photo taken");
    }

    public void play_music(){
        System.out.println("Music playing");
    }
}

 public class Prorgram_38 {
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        smartphone sp = new smartphone();
        sp.is_camera_off();
        sp.is_camera_on();
        sp.take_photo();
        sp.play_music();
        sp.stop_music();
    }
}