package designPattern.singleton;

/**
 * @author: dw
 * @Date: 2022/8/29 10:35
 * @Version: 1.0.0
 * 懒汉模式+synchronized+double-check+volatile(解决指令重排序)
 */
public class Singleton5 {

    private static volatile Singleton5 INSTANCE = null;

    private Singleton5() {}

    public static Singleton5 getInstance() {
        if (null == INSTANCE) {
            synchronized (Singleton5.class) {
                if (null == INSTANCE) {
                    INSTANCE = new Singleton5();
                }
            }
        }
        return INSTANCE;
    }
}
