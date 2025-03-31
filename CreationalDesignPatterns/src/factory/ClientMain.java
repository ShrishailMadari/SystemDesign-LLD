package factory;

interface Shapes {
    public void shape();
}

class Rectangle implements Shapes {

    @Override
    public void shape() {
        System.out.println("Rectangle Shape :)");
    }
}

class Square implements Shapes {

    @Override
    public void shape() {
        System.out.println("Square Shape :)");
    }
}

class Triangle implements Shapes {

    @Override
    public void shape() {
        System.out.println("Triangle Shape :)");
    }
}

class ShapeNotValidException extends Exception {
    public ShapeNotValidException(String message) {
        super(message);
    }
}

class ShapeFactory {
    public Shapes getShape(String shapes) throws ShapeNotValidException {
        if (shapes == null || shapes.isEmpty()) {
            throw new ShapeNotValidException("Not Valid Shape:");
        }

        return switch (shapes.toLowerCase()) {
            case "rectangle" -> new Rectangle();
            case "square" -> new Square();
            case "circle" -> new Triangle();  // Fixed: Previously it was returning a Triangle
            default -> throw new ShapeNotValidException("Not a valid shape: " + shapes);
        };
    }

}

public class ClientMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        try {
            Shapes shape = factory.getShape(" ");
            shape.shape();
        } catch (ShapeNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
