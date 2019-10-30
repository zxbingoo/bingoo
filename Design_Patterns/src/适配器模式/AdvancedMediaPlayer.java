package 适配器模式;

/**
 * @author jianbin
 * @date 2019/10/14
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
