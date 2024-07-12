package Interfaces;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Ellipse(5, 3);
        shapes[1] = new Circle(4);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(6);

        System.out.println("Shapes before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        scaleShapes(shapes, 2);

        System.out.println("\nShapes after scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}

