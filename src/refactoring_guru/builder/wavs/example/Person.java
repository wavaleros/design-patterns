package refactoring_guru.builder.wavs.example;

public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private String documentId;
    private String socialSecurityNumber;

    public Person() {
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(String firstName, String middleName) {
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Person(String firstName, String middleName, String lastName, String documentId) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.documentId = documentId;
    }

    public Person(String firstName, String middleName, String lastName, String documentId, String socialSecurityNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.documentId = documentId;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public static class PersonBuilder {
        private String firstName;
        private String middleName;
        private String lastName;
        private String documentId;
        private String socialSecurityNumber;

        public static PersonBuilder builder() {
            return new PersonBuilder();
        }

        public PersonBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder withMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder withDocumentId(String documentId) {
            this.documentId = documentId;
            return this;
        }

        public PersonBuilder withSocialSecurityNumber(String socialSecurityNumber) {
            this.socialSecurityNumber = socialSecurityNumber;
            return this;
        }

        public Person build() {
            return new Person(firstName, middleName, lastName, documentId, socialSecurityNumber);

        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", documentId='" + documentId + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
