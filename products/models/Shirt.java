package models;

import java.util.Objects;

public class Shirt extends Product {
  public enum Size {
    SMALL, MEDIUM, LARGE
  };

  private Size size;

  public Shirt(Size size, Double price, String color, String brand) {
    super(price, color, brand);
    this.size = size;
  }

  public Shirt(Shirt source) {
    super(source);
    this.size = source.size;
  }

  public Size getSize() {
    return this.size;
  }

  public void setSize(Size size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return super.toString()
        + "\tSize: " + this.size;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Shirt)) {
      return false;
    }
    Shirt shirt = (Shirt) o;
    return super.equals(shirt)
        && size.equals(shirt.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, super.hashCode());
  }

  @Override
  public void fold() {
    System.out.println("Folding activity occurs for shirt.");

  }

}