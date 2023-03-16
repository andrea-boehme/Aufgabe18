import java.util.Objects;

public class PersonWithHashCodeAndEquals {

    Integer age;
    String firstName;
    String lastName;


    /**
     * constructor method used to initialize objects. It is called when an object of a class is created.
     * @param age
     * @param firstName
     * @param lastName
     */
    public PersonWithHashCodeAndEquals(Integer age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * equals and hashCode methods
     * An object hash code value can change in multiple executions of the same application.
     * If two objects are equal according to equals() method, then their hash code must be same.
     * If two objects are unequal according to equals() method, their hash code are not required to be different
     * @param o
     * @return true if persons are equal, or false if not
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonWithHashCodeAndEquals person)) return false;
        return Objects.equals(getAge(), person.getAge()) && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getFirstName(), getLastName());
    }

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age.equals(person.age) && firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && weight == person.weight && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
  }


    @Override
    public int hashCode() {

        return Objects.hash(age, firstName, lastName);
    }

    */


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
