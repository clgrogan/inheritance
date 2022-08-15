import models.Pants;

public class ComparableDemo {

  public static void compareFun() {

    // Shirt shirt = new Shirt("SMALL", 17.99, "PINK", "Jucci");
    Pants pants1 = new Pants(32, 66., "blue", "Java Klein");
    Pants pants2 = new Pants(34, 104.99, "Red", "WAngular");
    Pants pants3 = new Pants(32, 104.99, "Blue", "WAngular");
    Pants pants4 = new Pants(24, 104.59, "White", "Bitberry");

    System.out.println("\nComparable Interface Demonstration\n");
    System.out.println("Pants.compareTo(T) method:"
        + "\n\tpublic int compareTo(Pants specifiedObject) {"
        + "\n\t\treturn (int) Math.round(super.getPrice() - specifiedObject.getPrice());"
        + "\n\t}\n");
    System.out.println("The pants:");
    System.out.println("\tpants1.toString() " + pants1);
    System.out.println("\tpants2.toString() " + pants2);
    System.out.println("\tpants3.toString() " + pants3);
    System.out.println("\tpants4.toString() " + pants4);
    System.out.println();

    System.out.println("pants1.compareTo(pants2): " + pants1.compareTo(pants2));
    System.out.println("pants2.compareTo(pants1): " + pants2.compareTo(pants1));
    System.out.println("pants2.compareTo(pants3): " + pants2.compareTo(pants3));
    System.out.println("pants2.compareTo(pants4): " + pants2.compareTo(pants4));
    System.out.println("pants4.compareTo(pants2): " + pants4.compareTo(pants2));

    System.out.println();
  }
}
