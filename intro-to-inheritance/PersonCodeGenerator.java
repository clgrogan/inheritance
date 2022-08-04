import java.util.Objects;

public class PersonCodeGenerator {
  private String name;
  private int age;

  public PersonCodeGenerator(String name, int age) {
    this.name = name;
    this.age = age;
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
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof PersonCodeGenerator)) {
      return false;
    }
    PersonCodeGenerator personCodeGenerator = (PersonCodeGenerator) o;
    return Objects.equals(name, personCodeGenerator.name) && age == personCodeGenerator.age;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  public String toString() {
    return "{" +
        " name='" + getName() + "'" +
        ", age='" + getAge() + "'" +
        "}";
  }

}
