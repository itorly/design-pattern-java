package com.dp.structural.flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        TreeType oakType = TreeFactory.getTreeType("Oak", "Green", "Rough");
        TreeType pineType = TreeFactory.getTreeType("Pine", "Dark Green", "Smooth");

        Tree tree1 = new Tree(10, 20, oakType);
        Tree tree2 = new Tree(30, 40, pineType);
        Tree tree3 = new Tree(50, 60, oakType);

        tree1.draw();
        tree2.draw();
        tree3.draw();

        // Verify that the same TreeType object is reused
        System.out.println("Are tree1 and tree3 using the same TreeType object? " + (tree1.geyTreeType() == tree3.geyTreeType()));
    }
}
