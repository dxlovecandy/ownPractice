package designPattern.singleton;

/**
 * @author: dw
 * @Date: 2022/8/29 10:25
 * @Version: 1.0.0
 * 懒汉模式+synchronized+double-check
 */
public class Singleton4 {

    private static Singleton4 INSTANCE = null;

    private Singleton4() {}

    /**
     * 解决了产生多个实例对象的问题，但若产生指令重排序，
     * 会产生对象的部分属性没有构造完成的情况
     * @return
     */
    public static Singleton4 getInstance() {
        if (null == INSTANCE) {
            synchronized (Singleton4.class) {
                if (null == INSTANCE) {
                    INSTANCE = new Singleton4();
                }
            }
        }
        return INSTANCE;
    }
}
