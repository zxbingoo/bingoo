package 建造者模式;

/**
 * class
 *
 * @author jianbin
 * @date 2019/10/12
 */
public class VegBurger extends Burger {
    @Override
    public String getName() {
        return "Veg Burger";
    }

    @Override
    public Float getPrice() {
        return 15.0f;
    }
}
