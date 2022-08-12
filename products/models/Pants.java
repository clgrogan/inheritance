package models;

import java.util.Objects;

public class Pants extends Product {
  private String waist;

  public Pants(String waist, Double price, String color, String brand) {
    super(price, color, brand);
    this.waist = waist;
  }

  public Pants(Pants source) {
    super(source);
    this.waist = source.waist;
  }

  public String getWaist() {
    return this.waist;
  }

  public void setWaist(String waist) {
    this.waist = waist;
  }

  @Override
  public String toString() {

    return ("{"
        + " Product: " + this.getClass().getSimpleName()
        + ", Brand (this.get...) = " + this.getBrand()
        + ", Waist = " + waist
        + ", Color (super.get...) = " + super.getColor()
        + ", Price = $" + super.getPrice()

    );
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
        && waist.equals(pants.waist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waist, super.hashCode());
  }

  @Override
  public void fold() {
    System.out.println("Folding activity occurs for pants.");

  }

}