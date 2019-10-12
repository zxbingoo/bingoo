package 单例模式.双检锁DCL;

/**
 * @author jianbin
 * @date 2019/10/12
 */
public class Singleton {
    private volatile static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
