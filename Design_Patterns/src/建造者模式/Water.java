package 建造者模式;

/**
 * class
 *
 * @author jianbin
 * @date 2019/10/12
 */
public class Water extends ColdDrink {
    @Override
    public String getName() {
        return "Water";
    }

    @Override
    public Float getPrice() {
        return 2.0f;
    }
}
