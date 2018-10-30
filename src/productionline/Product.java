///////////////////////////////////////////////////////////////////////////////
// File: Product.java
// By:   Greening, Zachary
// Date: September 28, 2018
// Description: A class that implements interface item that has general
//      attributes and methods relating to a product
///////////////////////////////////////////////////////////////////////////////

package productionline;

import java.util.Comparator;
import java.util.Date;

public abstract class Product implements Item {

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

  /**
   * Find bugs lists this class implementing Comparator without serialization as bad practice. For
   * the purposes of this project, since serialization is not needed, this bug has been ignored.
   */
  public static class SortByName implements Comparator<Product> {

    /**
     * Overriden function from interface Comparator to allow for the Collections.sort to sort
     * alphabetically by name.
     *
     * @param o1 the first product to sort alphabetically
     * @param o2 the second product to sort alphabetically
     * @return returns negative if order needs to be switched
     */
    @Override
    public int compare(Product o1, Product o2) {
      return o1.name.compareTo(o2.name);
    }
  }
}
