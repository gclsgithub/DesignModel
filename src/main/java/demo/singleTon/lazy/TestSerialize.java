package demo.singleTon.lazy;

import java.io.*;

public class TestSerialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        LazySingletonPreventSerialize l2 = LazySingletonPreventSerialize.getInstance();


        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Objectss"));

        try {
            objectOutputStream.writeObject(l2);
        }catch (Exception e){
e.printStackTrace();
        }

        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("Objectss")));
        LazySingletonPreventSerialize l3 = (LazySingletonPreventSerialize) objectInputStream.readObject();


        System.out.println(l2);
        System.out.println(l3);

        System.out.println(l2==l3);
    }
}
