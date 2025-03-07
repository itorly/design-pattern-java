package com.dp.structural.flyweight;

/**
 * Imagine you are developing a game where you need to render
 * a large number of trees. Each tree has a type (e.g., Oak, Pine, Maple)
 * and a position (x, y).
 * The type of the tree is intrinsic (shared) data,
 * while the position is extrinsic (unique) data.
 */
public class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }
}
