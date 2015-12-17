package com.myproject.jmp.task3;

import com.myproject.jmp.task3.iterator.LifoArrayList;

import java.util.*;

/**
 * Created by firel on 17.12.2015.
 */
public class Runner {
    public static void main(String[] args) {
        List<String> list = new LifoArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        for (String s : list) {
            System.out.println(s);
        }

        Iterator<String> stringIterator = list.iterator();
        while (stringIterator.hasNext()) {
            String string = stringIterator.next();
            if (string.equals("2")) {
                stringIterator.remove();
            } else {
                System.out.println(string);
            }
        }
        System.out.println("Length:" + list.size());
    }
}
