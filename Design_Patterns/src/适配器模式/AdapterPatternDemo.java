package 适配器模式;

/**
 * @author jianbin
 * @date 2019/10/14
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("vlc", "ok");
    }
}
