package Interfaces;

public class Ellipse extends Shape {
    private double a;
    private double b;

    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        if (axis1 > axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    @Override
    public double computeArea() {
        return Math.PI * a * b;
    }

    @Override
    public double computePerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
    }
}

