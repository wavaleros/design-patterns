package refactoring_guru.factory_method.wavs.example.shapes;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}