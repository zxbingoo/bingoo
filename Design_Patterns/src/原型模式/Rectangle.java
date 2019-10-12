package 原型模式;

/**
 * class
 *
 * @author jianbin
 * @date 2019/10/12
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
