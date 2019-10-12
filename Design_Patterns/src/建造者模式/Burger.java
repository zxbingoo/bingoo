package 建造者模式;

/**
 * class
 *
 * @author jianbin
 * @date 2019/10/12
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract Float getPrice();
}
