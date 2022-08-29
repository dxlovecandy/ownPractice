package designPattern.singleton;

/**
 * @author: dw
 * @Date: 2022/8/29 10:46
 * @Version: 1.0.0
 * 懒汉模式+内部类
 */
public class Singleton6 {

    private Singleton6() {}

    public static class InnerSingleton {
        private static Singleton6 INSTANCE = new Singleton6();
    }

    /**
     * 只有当getInstance方法被调用时，
     * 才会加载 InnerSingleton 类，而只有在加载 InnerSingleton 类之后，才会实例化创建对象。
     * @return
     */
    public static Singleton6 getInstance() {
        return InnerSingleton.INSTANCE;
    }
}
