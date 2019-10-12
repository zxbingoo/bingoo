package 工厂模式;

/**
 * class
 *
 * @author jianbin
 * @date 2019/10/11
 */
public class FactoryMain {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
    }
}
