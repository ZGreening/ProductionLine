///////////////////////////////////////////////////////////////////////////////
// File: Product.java
// By:   Greening, Zachary
// Date: September 28, 2018
// Description: A class that implements interface item that has general
//      attributes and methods relating to a product
///////////////////////////////////////////////////////////////////////////////

package productionline;

import java.util.ArrayList;
import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {

  private static int currentProductionNumber;         //The number of the next product to be made
  private final Date manufacturedOn;
  private String manufacturer;                        //Initialize manufacturer to default
  private int serialNumber;                           //The number of this product
  private String name;

  /**
   * Constructor to create a product and initialize its name, serial number and date manufactured
   * on. Increments the class variable currentProductionNumber to prepare it for the next, not yet
   * made, product. ###FindBugs-IDEA reports this, but since it is a constructor, I have chosen
   * simply to document and leave it###
   *
   * @param name the name of the product being created
   */
  public Product(String name) {
    this.name = name;
    this.manufacturer = Item.manufacturer;
    this.serialNumber = currentProductionNumber;   //Use the number of current product
    Product.currentProductionNumber++;             //Increment class variable for next product
    this.manufacturedOn = new Date();
  }

  public static void setProductionNumber(int number) {
    Product.currentProductionNumber = number;
  }

  /**
   * A method to print all items of a given ItemType in an ArrayList of Products.
   *
   * @param products The list of items to print from.
   * @param type The type of item to search for and print
   */
  public static void printType(ArrayList<Product> products, ItemType type) {
    for (Product product : products) {
      if (product instanceof AudioPlayer && type == ItemType.AUDIO) {
        System.out.println(product);
      } else if (product instanceof MoviePlayer && type == ItemType.VISUAL) {
        System.out.println(product);
      } else {
        System.out.println("Invalid type or product");
      }
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Returns a new date to avoid mutability of the date manufactured instance variable.
   *
   * @return date manufactured on
   */
  public Date getManufactureDate() {
    Date date = new Date();
    date.setTime(manufacturedOn.getTime());
    return date;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  /**
   * Overrides toString to return the manufacture, serial number, Date manufactured on, and the name
   * of the product.
   *
   * @return returns manufacturer, serial number, Date manufactured on, and name of product.
   */
  @Override
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacturedOn + "\n"
        + "Name : " + name;
  }

  @Override
  public int compareTo(Product product) {
    return name.compareTo(product.name);
  }
}
