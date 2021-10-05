package refactoring_guru.abstract_factory.wavs.example.factories;

import refactoring_guru.abstract_factory.wavs.example.shapes.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType) ;
}