package ru.mirea.ivashchenko.pr3.movable;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint topRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        topRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        topRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        topRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        topRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        topRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", topRight=" + topRight +
                '}';
    }
}
