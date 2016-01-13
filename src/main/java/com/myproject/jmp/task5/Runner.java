package com.myproject.jmp.task5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by firel on 14.01.2016.
 */
public class Runner {
    public static void main(String[] args) {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        String classpath = "com.myproject.jmp.task5.Semaphore";
        try {
            Class loadedClass = customClassLoader.findClass(classpath);
            Object myClass = loadedClass.newInstance();
            System.out.println("Object:" + myClass.getClass());
            Method methodToCall = loadedClass.getMethod("lever");
            System.out.println("Method:" + methodToCall);
            methodToCall.invoke(myClass);
        } catch (ClassNotFoundException e) {
            System.out.println("Class" + classpath + " not found");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
