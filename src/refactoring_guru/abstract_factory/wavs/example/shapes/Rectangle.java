package refactoring_guru.abstract_factory.wavs.example.shapes;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}