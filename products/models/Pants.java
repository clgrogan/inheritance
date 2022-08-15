package models;

import java.util.Objects;

public class Pants extends Product implements Discountable {
  private int waist;

  public Pants(int waist, Double price, String color, String brand) {
    super(price, color, brand);
    this.waist = waist;
  }

  public Pants(Pants source) {
    super(source);
    this.waist = source.waist;
  }

  public int getWaist() {
    return this.waist;
  }

  public void setWaist(int waist) {
    this.waist = waist;
  }

  @Override
  public String toString() {

    return (super.toString()
        + "\tWaist = " + waist);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Pants)) {
      return false;
    }
    Pants pants = (Pants) o;
    return super.equals(pants)
        && waist == pants.waist;
  }

  @Override
  public int hashCode() {
    return Objects.hash(waist, super.hashCode());
  }

  @Override
  public void fold() {
    System.out.println("Folding activity occurs for pants.");

  }

  @Override
  public void discount() {
    super.setPrice(super.getPrice() / 2);

  }

}