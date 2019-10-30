package 桥接模式;

/**
 * @author jianbin
 * @date 2019/10/14
 */
public class Circle extends Shape {
    public Circle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    @Override
    public void draw() {
        drawAPI.draw();
    }
}
