import models.Pants;
import models.Product;
import models.Shirt;

public class Main {

    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {

        Shirt shirt = new Shirt("SMALL", 17.99, "PINK", "American Java");
        Pants pants = new Pants("32", 66., "blue", "Java Klein");
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
}
