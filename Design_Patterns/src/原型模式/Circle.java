package 原型模式;

/**
 * class
 *
 * @author jianbin
 * @date 2019/10/12
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("画一个圆形");
    }
}
