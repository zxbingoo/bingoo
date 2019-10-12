package 建造者模式;

/**
 * class
 *
 * @author jianbin
 * @date 2019/10/12
 */
public class CombinationBuild {
    public Combination combinatVeg(){
        Combination combination = new Combination();
        combination.addItem(new VegBurger());
        combination.addItem(new Water());
        return combination;
    }
}
