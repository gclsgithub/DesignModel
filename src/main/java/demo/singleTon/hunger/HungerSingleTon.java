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
public class HungerSingleTon {

    public final static HungerSingleTon instance = new HungerSingleTon();


    public static HungerSingleTon getInstance() {
        return instance;
    }

    private HungerSingleTon() {

    }
}
