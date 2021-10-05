package refactoring_guru.factory_method.wavs.example.shapes;


public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}