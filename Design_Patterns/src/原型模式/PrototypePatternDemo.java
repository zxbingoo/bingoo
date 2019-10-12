package 原型模式;

/**
 * class
 *
 * @author jianbin
 * @date 2019/10/12
 */
public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape(1);
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape(2);
        System.out.println("Shape : " + clonedShape2.getType());

    }
}
