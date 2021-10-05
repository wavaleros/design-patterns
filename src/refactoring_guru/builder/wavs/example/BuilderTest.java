package refactoring_guru.builder.wavs.example;

public class BuilderTest {

    public static void main(String[] args) {
        Person person = new Person();
        Person personBuilder = Person.PersonBuilder.builder().withDocumentId("asd").build();
        System.out.println(person);
        System.out.println(personBuilder);

    }
}

