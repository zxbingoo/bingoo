package 适配器模式;

/**
 * class
 *
 * @author jianbin
 * @date 2019/10/14
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("不支持格式");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("开始播放MP4");
    }
}
