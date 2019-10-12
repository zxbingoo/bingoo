package 建造者模式;

/**
 * class
 *
 * @author jianbin
 * @date 2019/10/12
 */
public class Bottle implements Packing {
    @Override
    public String packing() {
        return "bottle";
    }
}
