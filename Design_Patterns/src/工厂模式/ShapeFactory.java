package 工厂模式;

/**
 * class
 *
 * @author jianbin
 * @date 2019/10/11
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }

}
