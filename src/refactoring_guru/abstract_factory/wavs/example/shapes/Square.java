package refactoring_guru.abstract_factory.wavs.example.shapes;


public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}