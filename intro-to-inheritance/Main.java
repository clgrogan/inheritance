public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Zach", 27);
        Person person2 = new Person(person1);

        System.out.println("\n - - - - Overriding Demonstration - - - - \n");
        System.out.println(
                "Person person1 = new Person(\"Zach\", 27);"
                        + "\nPerson person2 = new Person(person1);"
                        + "\n\n With standard equals() person1 and person2 are NOT equal."
                        + "\n Despite having fields with matching values.");
        System.out.println(
                "\n Overriding the equals method in the Person class"
                        + "\n enables person1.equals(person2) to be true when the"
                        + "\n fields of the objects have the same values"
                        + "\n based on the logic you add to the overriding method.");
        System.out.println();
        System.out.println("Overridden equals() person1.equals(person2): " + person1.equals(person2));

        System.out.println();
    }
}
