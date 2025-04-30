package abstractfactory;
interface Shapes{
    void shape();
}

class Rectangle implements Shapes{

    @Override
    public void shape() {
        System.out.println("Rectangle Shape.. ");
    }
}
class Square implements Shapes{

    @Override
    public void shape() {
        System.out.println("Square Shape:) ");
    }
}
class Circle implements Shapes{

    @Override
    public void shape() {
        System.out.println("Circle Shape:) ");
    }
}

interface Color{
    void fill();
}

class Red implements Color{

    @Override
    public void fill() {
        System.out.println("Fill The Red color...🟥");
    }
}
class Green implements Color{

    @Override
    public void fill() {
        System.out.println("Fill The Red color...🟩");
    }
}

class Blue implements Color{

    @Override
    public void fill() {
        System.out.println("Fill The Red color...🟦");
    }
}
interface Borders{
    void style();
}

class Dashed implements Borders{

    @Override
    public void style() {
        System.out.println("Dashed Borders ");
    }
}
class Solid implements Borders{

    @Override
    public void style() {
        System.out.println("Solid Borders ");
    }
}
interface Texture{
    void applyTexture();
}

class Smooth implements Texture{

    @Override
    public void applyTexture() {
        System.out.println("Smooth Texture");
    }
}
class Rough implements Texture{

    @Override
    public void applyTexture() {
        System.out.println("Rough Texture");
    }
}

abstract class AbstractFactory{
    abstract Shapes getShapes(String shapeType);
    abstract Color getColor(String colorType);
    abstract Borders getBorders(String borderType);
    abstract Texture getTexture(String textureType);
}

class ShapeFactory extends AbstractFactory{

    @Override
    Shapes getShapes(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String colorType) {
        return null;
    }

    @Override
    Borders getBorders(String borderType) {
        return null;
    }

    @Override
    Texture getTexture(String textureType) {
        return null;
    }
}

public class Client {
    public static void main(String[] args) {

    }
}
