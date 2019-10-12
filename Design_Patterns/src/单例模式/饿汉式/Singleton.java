package 单例模式.饿汉式;

/**
 * @author jianbin
 * @date 2019/10/12
 */
public class Singleton {
    private static final Singleton instance = new Singleton();

    public Singleton getInstance(){
        return instance;
    }
}
