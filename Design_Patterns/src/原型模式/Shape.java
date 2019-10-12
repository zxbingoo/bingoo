package 原型模式;

/**
 * class
 *
 * @author jianbin
 * @date 2019/10/12
 */
public abstract class Shape implements Cloneable {
    private Integer distinctId;
    protected String type;

    abstract public void draw();

    public Integer getDistinctId() {
        return distinctId;
    }

    public void setDistinctId(Integer distinctId) {
        this.distinctId = distinctId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
