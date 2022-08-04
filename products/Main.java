import models.Pants;
import models.Shirt;

public class Main {

    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {

        Shirt shirt = new Shirt("SMALL", 17.99, "PINK", "American Java");
        Pants pants = new Pants("32", 66., "blue", "Java Klein");

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
