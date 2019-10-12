package 原型模式;

import java.util.Hashtable;

/**
 * @author jianbin
 * @date 2019/10/12
 */
public class ShapeCache {

    private static Hashtable<Integer, Shape> shapeMap = new Hashtable();

    public static Shape getShape(Integer distinctId) throws CloneNotSupportedException {
        Shape shape = shapeMap.get(distinctId);
        return (Shape)shape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setDistinctId(1);
        shapeMap.put(circle.getDistinctId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setDistinctId(2);
        shapeMap.put(rectangle.getDistinctId(),rectangle);
    }
}
