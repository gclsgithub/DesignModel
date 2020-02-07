package demo.singleTon.hunger;

/**
 * 单例模式
 * --饿汉模式 （一种非延迟加载的策略）
 * <p>
 * 1.私有构造函数
 * <p>
 * 2.类加载是就出生成实例（静态代码库或者直接new）
 * <p>
 * 3.唯一的方法获得实例
 */
public class HungerSingleton {

    public final static HungerSingleton instance = new HungerSingleton();


    public static HungerSingleton getInstance() {
        return instance;
    }

    private HungerSingleton() {

    }
}
