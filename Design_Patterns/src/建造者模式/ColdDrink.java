package 建造者模式;

/**
 * @author jianbin
 * @date 2019/10/12
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract Float getPrice();
}
