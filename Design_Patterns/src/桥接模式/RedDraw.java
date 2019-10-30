package 桥接模式;

/**
 * class
 *
 * @author jianbin
 * @date 2019/10/14
 */
public class RedDraw implements DrawAPI {
    @Override
    public void draw() {
        System.out.println("红色");
    }
}
