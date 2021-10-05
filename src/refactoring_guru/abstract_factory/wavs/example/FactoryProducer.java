package refactoring_guru.abstract_factory.wavs.example;

import refactoring_guru.abstract_factory.wavs.example.factories.AbstractFactory;
import refactoring_guru.abstract_factory.wavs.example.factories.RoundedShapeFactory;
import refactoring_guru.abstract_factory.wavs.example.factories.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
