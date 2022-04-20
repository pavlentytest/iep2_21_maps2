package ru.samsung.itschool.mdev;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // HashMap
        // TreeMap
        HashMap<String,String> cities = new HashMap<>();
        cities.put("msk","Russia");
        cities.put("msk","Usa");
        cities.put("spb","Russia");
        cities.put("brl", "Germany");

        for(Map.Entry<String,String> e: cities.entrySet()) {
            System.out.println(e.getKey() + "; "+e.getValue());
        }

        // cities.containsKey()
        //cities.containsValue()

        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(100,"Ivan");
        treeMap.put(100,"Ivan");
        treeMap.put(100,"Ivan");
        treeMap.put(102,"Petr");
        treeMap.put(1,"Oleg");
        treeMap.put(20,"Maria");

        for(Map.Entry<Integer,String> e: treeMap.entrySet()) {
            System.out.println(e.getKey() + "; "+e.getValue());
        }

    }
}
