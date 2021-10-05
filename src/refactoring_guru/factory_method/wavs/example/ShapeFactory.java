package refactoring_guru.factory_method.wavs.example;

import refactoring_guru.factory_method.wavs.example.shapes.Circle;
import refactoring_guru.factory_method.wavs.example.shapes.Rectangle;
import refactoring_guru.factory_method.wavs.example.shapes.Shape;
import refactoring_guru.factory_method.wavs.example.shapes.Square;

public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}