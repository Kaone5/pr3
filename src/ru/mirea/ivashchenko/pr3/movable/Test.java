package ru.mirea.ivashchenko.pr3.movable;

public class Test {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(1,2, 3,4);
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);
        p1.moveLeft();
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        p1.moveUp();
        System.out.println(p1);

        MovableCircle c1 = new MovableCircle(4,3,2,6);
        System.out.println(c1);
        c1.moveRight();
        System.out.println(c1);
        c1.moveLeft();
        System.out.println(c1);
        c1.moveDown();
        System.out.println(c1);
        c1.moveUp();
        System.out.println(c1);

        MovableRectangle r1 = new MovableRectangle(1,2,7,3,4,6);
        System.out.println(r1);
        r1.moveRight();
        System.out.println(r1);
        r1.moveLeft();
        System.out.println(r1);
        r1.moveDown();
        System.out.println(r1);
        r1.moveUp();
        System.out.println(r1);
    }

}
