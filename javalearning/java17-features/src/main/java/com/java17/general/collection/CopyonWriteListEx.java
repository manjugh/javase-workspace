package com.java17.general.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonWriteListEx {

    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> integerList = new CopyOnWriteArrayList<>(List.of(1, 2, 3, 4, 5, 6));
       // ArrayList<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
            if(next == 4 ){
                iterator.remove();
                //integerList.add(10);
                //integerList.remove(5);
            }
        }

        System.out.println(integerList);
    }
}
