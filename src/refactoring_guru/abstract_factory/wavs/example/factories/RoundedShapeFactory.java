package refactoring_guru.abstract_factory.wavs.example.factories;

import refactoring_guru.abstract_factory.wavs.example.shapes.Shape;
import refactoring_guru.abstract_factory.wavs.example.shapes.RoundedRectangle;
import refactoring_guru.abstract_factory.wavs.example.shapes.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}
