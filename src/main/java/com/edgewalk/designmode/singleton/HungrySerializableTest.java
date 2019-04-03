package com.edgewalk.designmode.singleton;

import java.lang.reflect.Constructor;

public class HungrySerializableTest {

    public static void main(String[] args) throws Exception {
       /* SingletonEnum s1 = SingletonEnum.INSTANCE;
        SingletonEnum s2 = null;
        try {
            //序列化就是说把内存中的状态通过转换成字节码的形式保存在介质中
            FileOutputStream fos = new FileOutputStream("serializable.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            fos.close();

            //反序列化讲已经持久化的字节码内容，转换为IO流,通过IO流的读取，进而将读取的内容转换为Java对象
            //在转换过程中会重新创建对象new
            FileInputStream fis = new FileInputStream("serializable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s2 = (SingletonEnum) ois.readObject();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        Class<SingletonEnum> classType = SingletonEnum.class;
        //返回指定参数类型、所有声明的（包括private）构造函数
        Constructor<SingletonEnum> c = (Constructor<SingletonEnum>) classType.getDeclaredConstructor(String.class, int.class);
        c.setAccessible(true);
        c.newInstance("abc", 123).whateverMethod();
    }
}