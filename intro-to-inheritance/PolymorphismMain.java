public class PolymorphismMain {
  public static void main(String[] args) {
    Person person1 = new Person("Bob", 45);
    Person person2 = new Person("George", 66);
    Person person3 = person2;
    Object objectPerson1 = new Person("Phyllis", 102);
    Object objectPerson2 = new Person(person2);
    Object objectPerson3 = person3;
    Object object = (Object) person1; // person1 is instance of Person class

    System.out.println("\nperson1 Information" + getObjectDetails(person1));
    System.out.println("\nperson2 Information" + getObjectDetails(person2));
    System.out.println("\nperson3 Information" + getObjectDetails(person3));
    System.out.println("\nobjectPerson1 Information" + getObjectDetails(objectPerson1));
    System.out.println("\nobjectPerson2 Information" + getObjectDetails(objectPerson2));
    System.out.println("\nobjectPerson3 Information" + getObjectDetails(objectPerson3));
    System.out.println();
    System.out.println("Person personObject1 = new Object(person2);");
    System.out.println("\tThe constructor Object(Person) is undefinedJava(134217858)"
        + "\n\tType mismatch: cannot convert from Object to PersonJava(16777233)");
    System.out.println();
    System.out.println("Cast a Person to a new Object");
    System.out.println("    Object object = (Object) person1; // person1 is instance of Person class");
    System.out.println("\nobject Information" + getObjectDetails(object));
    System.out.println();
  }

  private static String getObjectDetails(Object o) {
    String returnString;
    if (o == null)
      return null;
    if (!(o instanceof Person))
      return "Not a person is a " + o.getClass();
    returnString = "\n\t" + o.getClass();
    returnString += "\n\tReference: " + o;
    returnString += o.toString();

    return returnString;
  }
}
