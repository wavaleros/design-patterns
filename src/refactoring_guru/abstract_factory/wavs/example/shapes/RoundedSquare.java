package refactoring_guru.abstract_factory.wavs.example.shapes;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}