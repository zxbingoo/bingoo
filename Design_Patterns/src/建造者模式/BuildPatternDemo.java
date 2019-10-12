package 建造者模式;

/**
 * @author jianbin
 * @date 2019/10/12
 */
public class BuildPatternDemo {

    public static void main(String[] args) {
        CombinationBuild combinationBuild = new CombinationBuild();
        Combination combination = combinationBuild.combinatVeg();
        combination.getCost();
        combination.showItems();
    }

}
