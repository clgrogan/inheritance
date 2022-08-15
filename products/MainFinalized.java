import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import models.Pants;
import models.Product;
import models.Shirt;

public class MainFinalized {

  private final static String FILE_NAME = "products.txt";

  public static void main(String[] args) throws FileNotFoundException {
    Product[] products = getData();
    Arrays.sort(products);
    System.out.println();
    for (Product product : products) {
      System.out.println(product);
    }
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
  public static Product[] getData() throws FileNotFoundException {
    FileInputStream fis = new FileInputStream(FILE_NAME);
    Scanner scan = new Scanner(fis);

    ArrayList<Product> productsList = new ArrayList<Product>();

    while (scan.hasNextLine()) {
      switch (scan.next()) {
        case "PANTS":
          productsList.add(new Pants(scan.nextInt(), scan.nextDouble(), scan.next(), scan.next()));
          break;
        case "SHIRT":
          productsList.add(new Shirt(Shirt.Size.valueOf(scan.next()), scan.nextDouble(), scan.next(), scan.next()));
          break;
      }

    }
    scan.close();

    Product[] products = new Product[productsList.size()];
    return productsList.toArray(products);

  }
}
