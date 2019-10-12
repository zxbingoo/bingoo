package 单例模式.静态内部类;

/**
 * @author jianbin
 * @date 2019/10/12
 */
public class Singleton {
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
