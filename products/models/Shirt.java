package models;

public class Shirt extends Product {
  private String size;

  public Shirt(String size, Double price, String color, String brand) {
    this.size = size;
  }

}