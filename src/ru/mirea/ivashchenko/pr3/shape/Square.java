package ru.mirea.ivashchenko.pr3.shape;

public class Square extends Rectangle {
    protected double side;

    public Square(){
        this.side = 1;
        this.color = "red";
        this.filled = false;
    }

    public Square(double side){
        this.side = side;
        this.color = "red";
        this.filled = false;
    }

    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + this.side + " , color: " + this.color;
    }
}
