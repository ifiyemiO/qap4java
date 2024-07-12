package Interfaces;

public class Circle extends Ellipse {
    public Circle(double radius) {
        super(radius, radius);
        name = "Circle";
    }

    @Override
    public void scale(double factor) {
        super.scale(factor);
    }
}

