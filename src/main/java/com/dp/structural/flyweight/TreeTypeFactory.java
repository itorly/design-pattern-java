package com.dp.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {

    private static final Map<String, TreeType> treeTypeMap = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        TreeType result = treeTypeMap.get(name);
        if (result == null) {
            result = new TreeType(name, color, texture);
            treeTypeMap.put(name, result);
        }
        return result;
    }
}
