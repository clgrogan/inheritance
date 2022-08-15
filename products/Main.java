import java.util.Arrays;

import models.Pants;
import models.Product;
import models.Shirt;

public class Main {

        static final String FILE_NAME = "products.txt";

        public static void main(String[] args) {

                Shirt shirt = new Shirt(Shirt.Size.SMALL, 17.99, "PINK", "American Java");
                Pants pants = new Pants(32, 66., "blue", "Java Klein");
                Pants pantsCC = new Pants(pants);
                Shirt shirtCC = new Shirt(shirt);

                Product[] productArray = new Product[] { shirt, pants };
                System.out.println();
                System.out.println(shirt);
                System.out.println(pants);
                shirt.setPrice(666.66);
                System.out.println();
                for (Product product : productArray) {
                        System.out.println(product);
                }
                System.out.println("\tAs written, the productArray is an array storing"
                                + "\n\ta reference to the original objects.");
                System.out.println();
                System.out.println(shirtCC);
                System.out.println(pantsCC);
                System.out.println();
                System.out.println("Test drive the equals and hashCode methods Product > Shirt:");
                System.out.println("\tshirt.toString():   " + shirt.toString());
                System.out.println("\t   hashCode:   " + shirt.hashCode()
                                + "\n\t   sys...hash: " + System.identityHashCode(shirt));
                System.out.println("\tshirtCC.toString(): " + shirtCC.toString());
                System.out.println("\t   hashCode:   " + shirtCC.hashCode()
                                + "\n\t   sys...hash: " + System.identityHashCode(shirtCC));
                System.out.println("shirt.equals(shirtCC): " + shirt.equals(shirtCC) + " (should be false)");
                System.out.println("\n...again with\n\tShirt shirt2 = new Shirt(shirt);");
                Shirt shirt2 = new Shirt(shirt);
                System.out.println("\tshirt.toString():   " + shirt.toString());
                System.out.println("\t   hashCode:   " + shirt.hashCode()
                                + "\n\t   sys...hash: " + System.identityHashCode(shirt));
                System.out.println("\tshirt2.toString(): " + shirt2.toString());
                System.out.println("\t   hashCode:   " + shirt2.hashCode()
                                + "\n\t   sys...hash: " + System.identityHashCode(shirt2));
                System.out.println("shirt.equals(shirt2): " + shirt.equals(shirt2) + " (should be true)");
                System.out.println("\n...again with\n\tShirt shirt3 = shirt;");
                Shirt shirt3 = shirt;
                System.out.println("\tshirt.toString():   " + shirt.toString());
                System.out.println("\t   hashCode:   " + shirt.hashCode()
                                + "\n\t   sys...hash: " + System.identityHashCode(shirt));
                System.out.println("\tshirt3.toString(): " + shirt3.toString());
                System.out.println("\t   hashCode:   " + shirt3.hashCode()
                                + "\n\t   sys...hash: " + System.identityHashCode(shirt3));
                System.out.println("shirt.equals(shirt3): " + shirt.equals(shirt3) + " (should be true)");
                System.out.println("\n...again with"
                                + "\n\t shirt2.setSize(\"Itsy-Bitsy-Teeny-Weeny\")"
                                + "\n\t shirt2.setColor(\"Yellow\")"
                                + "\n\t shirt2.setBrand(\"Polka-Dot Bikini\")");
                shirt2.setBrand("Polka-Dot Bikini");
                shirt2.setColor("Yellow");
                shirt2.setSize(Shirt.Size.SMALL);
                System.out.println("\tshirt.toString():   " + shirt.toString());
                System.out.println("\t   hashCode:   " + shirt.hashCode()
                                + "\n\t   sys...hash: " + System.identityHashCode(shirt));
                System.out.println("\tshirt2.toString(): " + shirt2.toString());
                System.out.println("\t   hashCode:   " + shirt2.hashCode()
                                + "\n\t   sys...hash: " + System.identityHashCode(shirt2));
                System.out.println("shirt.equals(shirt2): " + shirt.equals(shirt2) + " (should be false)");

                pants.setPrice(666.66);
                System.out.println("\nTest drive the equals and hashCode methods Product > Pants:");
                System.out.println("\tpants.toString():   " + pants.toString());
                System.out.println("\t   hashCode:   " + pants.hashCode()
                                + "\n\t   sys...hash: " + System.identityHashCode(pants));
                System.out.println("\tpantsCC.toString(): " + pantsCC.toString());
                System.out.println("\t   hashCode:   " + pantsCC.hashCode()
                                + "\n\t   sys...hash: " + System.identityHashCode(pantsCC));
                System.out.println("pants.equals(pantsCC): " + pants.equals(pantsCC) + " (should be false)");
                System.out.println("\n...again with\n\tpants pants2 = new pants(pants);");
                Pants pants2 = new Pants(pants);
                System.out.println("\tpants.toString():   " + pants.toString());
                System.out.println("\t   hashCode:   " + pants.hashCode()
                                + "\n\t   sys...hash: " + System.identityHashCode(pants));
                System.out.println("\tpants2.toString(): " + pants2.toString());
                System.out.println("\t   hashCode:   " + pants2.hashCode()
                                + "\n\t   sys...hash: " + System.identityHashCode(pants2));
                System.out.println("pants.equals(pants2): " + pants.equals(pants2) + " (should be true)");
                System.out.println("\n...again with\n\tPants pants3 = pants;");
                Pants pants3 = pants;
                System.out.println("\tpants.toString():   " + pants.toString());
                System.out.println("\t   hashCode:   " + pants.hashCode()
                                + "\n\t   sys...hash: " + System.identityHashCode(pants));
                System.out.println("\tpants3.toString(): " + pants3.toString());
                System.out.println("\t   hashCode:   " + pants3.hashCode()
                                + "\n\t   sys...hash: " + System.identityHashCode(pants3));
                System.out.println("pants.equals(pants3): " + pants.equals(pants3) + " (should be true)");
                System.out.println("\n...again with\n\tpants2.setWaist(\"Skinny\")");
                pants2.setWaist(24);
                System.out.println("\tpants.toString():   " + pants.toString());
                System.out.println("\t   hashCode:   " + pants.hashCode()
                                + "\n\t   sys...hash: " + System.identityHashCode(pants));
                System.out.println("\tpants2.toString(): " + pants2.toString());
                System.out.println("\t   hashCode:   " + pants2.hashCode()
                                + "\n\t   sys...hash: " + System.identityHashCode(pants2));
                System.out.println("pants.equals(pants2): " + pants.equals(pants2) + " (should be false)");

                System.out.println();
                ComparableDemo.compareFun();
                System.out.println();
                sample1Sort();
                System.out.println();
                sample2Sort();
                System.out.println();
                doubleDown();
                System.out.println();

        }

        /**
         * Function Name: getData
         * 
         * @return Product[]
         * @throws FileNotFoundException
         * 
         *                               Inside the function:
         *                               1. Loads the data from products.txt
         */

        private static void sample1Sort() {

                Product[] products = new Product[] {
                                new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
                                new Pants(34, 104.99, "Red", "JANGLER"),
                                new Pants(30, 119.99, "Grey", "FENDI"),
                                new Pants(30, 129.99, "Red", "VERSACE"),
                                new Pants(29, 99.99, "Dark", "JANGLER"),
                                new Pants(26, 24.99, "Indigo", "BELSTAFF"),
                                new Pants(34, 104.99, "Red", "JANGLER"),
                };
                System.out.println("\nProducts array PRE-sort.");
                printArray(products);

                Arrays.sort(products);
                System.out.println("\nProducts array POST-sort.");
                printArray(products);

        }

        public static void sample2Sort() {

                Product[] products = new Product[] {
                                new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
                                new Shirt(Shirt.Size.MEDIUM, 22.99, "Black", "CHANEL"),
                                new Pants(34, 104.99, "Red", "JANGLER"),
                                new Shirt(Shirt.Size.SMALL, 13.99, "Orange", "GEORGE"),
                                new Pants(30, 119.99, "Grey", "FENDI"),
                                new Shirt(Shirt.Size.LARGE, 34.99, "Blue", "ECKO"),
                                new Pants(30, 129.99, "Red", "VERSACE"),
                                new Shirt(Shirt.Size.SMALL, 22.99, "Beige", "ZARA"),
                                new Pants(29, 99.99, "Dark", "JANGLER"),
                                new Shirt(Shirt.Size.SMALL, 19.99, "Red", "NIKE"),
                                new Pants(26, 24.99, "Indigo", "BELSTAFF"),
                                new Shirt(Shirt.Size.LARGE, 29.99, "Blue", "ADIDAS"),
                                new Pants(34, 104.99, "Red", "JANGLER"),
                };
                System.out.println("\n PRE-sort: ");
                printArray(products);

                Arrays.sort(products);
                System.out.println("\n POST-sort: ");
                printArray(products);
        }

        public static void doubleDown() {
                Product[] products = new Product[] {
                                new Pants(32, 24.59, "Blue", "JAVA KLEIN"),
                                new Shirt(Shirt.Size.MEDIUM, 24.29, "Black", "CHANEL"),
                                new Pants(34, 24.53, "Red", "JANGLER"),
                                new Shirt(Shirt.Size.SMALL, 24.89, "Orange", "GEORGE"),
                                new Pants(30, 24.54, "Grey", "FENDI"),
                                new Shirt(Shirt.Size.LARGE, 24.49, "Blue", "ECKO"),
                                new Pants(30, 24.51, "Red", "VERSACE"),
                                new Shirt(Shirt.Size.SMALL, 24.49, "Beige", "ZARA"),
                                new Pants(29, 24.53, "Dark", "JANGLER"),
                                new Shirt(Shirt.Size.SMALL, 24.79, "Red", "NIKE"),
                                new Pants(26, 24.58, "Indigo", "BELSTAFF"),
                                new Shirt(Shirt.Size.LARGE, 24.54, "Blue", "ADIDAS"),
                                new Pants(34, 24.50, "Red", "JANGLER"),
                };
                System.out.println("\n PRE-sort: ");
                printArray(products);

                Arrays.sort(products);
                System.out.println("\n POST-sort: ");
                printArray(products);
        }

        public static void printArray(Product[] array) {
                for (int i = 0; i < array.length; i++) {
                        System.out.println("\s" + array[i]);
                }
        }
}
