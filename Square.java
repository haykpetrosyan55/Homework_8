package Homework_8;

public class Square extends Rectangle {
    private double side = 1;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
        this.setWidth();
        this.setLength();  // ??? coment ??? ...
    }

    public Square(String color, boolean filled, double width, double lenght, double side) {
        super(color, filled, width, lenght);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    private void setWidth(){
        this.setWidth(side);   // ??? coment ??? ...
    }

    private void setLength(){
        this.setLength(side);     // ??? coment ??? ...
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
