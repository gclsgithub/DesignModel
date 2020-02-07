package demo.singleTon.lazy;

import java.io.Serializable;
import java.util.Objects;

public class LazySingletonPreventSerialize implements Serializable {


    //延迟加载   volatile防止重排序
    private volatile static LazySingletonPreventSerialize instance;

    public static LazySingletonPreventSerialize getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (LazySingletonPreventSerialize.class) {
                if (Objects.isNull(instance)) {
                    instance = new LazySingletonPreventSerialize();
                }
            }
        }
        return instance;
    }

    public LazySingletonPreventSerialize() {
    }


    private Object readResolve(){
        return instance;
    }

}
