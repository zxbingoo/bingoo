package 建造者模式;

/**
 * @author jianbin
 * @date 2019/10/12
 */
public interface Item {
    public String getName();
    public Packing packing();
    public Float getPrice();
}
