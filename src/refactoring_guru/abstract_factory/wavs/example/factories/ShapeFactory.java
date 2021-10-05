package refactoring_guru.abstract_factory.wavs.example.factories;


import refactoring_guru.abstract_factory.wavs.example.shapes.Shape;
import refactoring_guru.abstract_factory.wavs.example.shapes.Rectangle;
import refactoring_guru.abstract_factory.wavs.example.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
