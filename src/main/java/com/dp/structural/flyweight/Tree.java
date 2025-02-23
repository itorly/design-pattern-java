package com.dp.structural.flyweight;

public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public TreeType getTreeType() {
        return this.type;
    }

    /**
     * Draw the tree
     */
    public void draw() {
        String name = type.getName();
        String color = type.getColor();
        String texture = type.getTexture();
        System.out.printf(
                "Drawing a %s tree at (%d, %d) with color %s and texture %s%n",
                name, x, y, color, texture
        );
    }
}
