package Interfaces;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
        name = "Equilateral Triangle";
    }

    @Override
    public void scale(double factor) {
        super.scale(factor);
    }
}

