package 建造者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * class
 *
 * @author jianbin
 * @date 2019/10/12
 */
public class Combination {
    private List<Item> items = new ArrayList();

    public void addItem(Item item){
        items.add(item);
    }

    public Float getCost(){
        float sum = 0.0f;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.println("商品名称" + item.getName());
            System.out.println("商品单价" + item.getPrice());
        }
    }

}
