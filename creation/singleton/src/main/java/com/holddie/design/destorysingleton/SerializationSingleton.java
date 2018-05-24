package com.holddie.design.destorysingleton;

import com.holddie.design.singleton.Singleton06;

import java.io.*;

/**
 * 反序列化破坏单例模式
 * @author yangze1
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/5/24 10:30
 */
public class SerializationSingleton {

    public static void main(String[] args) {
        Singleton06 singleton06 = Singleton06.getInstance();

        ObjectOutput out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(
                    "filename.ser"));
            out.writeObject(singleton06);
            out.close();

            ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
            Singleton06 singleton061 = (Singleton06) in.readObject();
            in.close();

            ObjectInput in1 = new ObjectInputStream(new FileInputStream("filename.ser"));
            Singleton06 singleton062 = (Singleton06) in1.readObject();
            in1.close();

            System.out.println(singleton06.hashCode());
            System.out.println(singleton061.hashCode());
            System.out.println(singleton062.hashCode());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
