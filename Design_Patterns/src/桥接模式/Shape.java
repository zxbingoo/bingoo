package 桥接模式;

/**
 * class
 *
 * @author jianbin
 * @date 2019/10/14
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
