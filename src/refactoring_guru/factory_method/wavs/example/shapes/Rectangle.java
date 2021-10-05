package refactoring_guru.factory_method.wavs.example.shapes;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}