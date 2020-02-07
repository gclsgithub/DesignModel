package demo.singleTon.lazy;

import java.util.Objects;

/**
 * 懒汉模式（延迟加载）
 * <p>
 * 1.私有构造起
 * <p>
 * 2.只有唯一的获取单例的方法
 * <p>
 * 3.双重check（防止锁过大，影响资源）
 */
public class LazySingleTonDoubleCheck {

    //延迟加载   volatile防止重排序
    private volatile static LazySingleTonDoubleCheck instance;

    public static LazySingleTonDoubleCheck getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (LazySingleTonDoubleCheck.class) {
                if (Objects.isNull(instance)) {
                    instance = new LazySingleTonDoubleCheck();
                }
            }
        }
        return instance;
    }

    public LazySingleTonDoubleCheck() {
    }
}
