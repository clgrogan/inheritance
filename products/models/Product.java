package models;

import java.util.Objects;

public abstract class Product implements Comparable<Product> {
  private Double price;
  private String color;
  private String brand;

  public Product(Double price, String color, String brand) {
    this.price = price;
    this.color = color;
    this.brand = brand;
  }

  public Product(Product source) {
    this.price = source.price;
    this.color = source.color;
    this.brand = source.brand;
  }

  public Double getPrice() {
    return this.price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  @Override
  public String toString() {
    return (this.getClass().getSimpleName()
        + "\tPrice: " + this.price
        + "\tBrand: " + this.brand
        + "\tColor: " + this.color);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Product)) {
      return false;
    }
    Product product = (Product) o;
    return price == product.getPrice()
        && color.equals(product.getColor())
        && brand.equals(product.getBrand());
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, color, brand);
  }

  public abstract void fold();

  @Override
  public int compareTo(Product specifiedObject) { // receives an object
    String className = this.getClass().getSimpleName();
    String sClassName = specifiedObject.getClass().getSimpleName();

    if (!className.equals(sClassName))
      return className.compareTo(sClassName);

    // return (int) Math.round(this.getPrice() - specifiedObject.getPrice());
    return Double.compare(this.getPrice(), specifiedObject.getPrice());
  }

}
