package 单例模式.懒汉式;

/**
 * @author jianbin
 * @date 2019/10/11
 */
public class Singleton {

    private static Singleton instance;

    public synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
