import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person source) {
        this.name = source.name;
        this.age = source.age;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null || !(obj instanceof Person))
            return false;
        Person person = (Person) obj;

        return this.age == person.getAge() && this.name.equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.age, this.name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ""
                + "\n\t\tName: " + this.name
                + "\n\t\tAge: " + this.age;
    }
}
