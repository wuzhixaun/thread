package com.wuzx.thread.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ArrayTest {


    public static void main(String[] args) {

        new ArrayList<>();
        new LinkedList<>();


        final HashMap<String, String> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("a", "1");
        objectObjectHashMap.put("a", "2");
        objectObjectHashMap.put("b", "3");

        System.out.println(1 << 4);
    }
}
