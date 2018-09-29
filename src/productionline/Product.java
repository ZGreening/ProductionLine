///////////////////////////////////////////////////////////////////////////////
// File: Product.java
// By:   Greening, Zachary
// Date: September 28, 2018
// Description: A class that implements interface item that has general
//      attributes and methods relating to a product
//
///////////////////////////////////////////////////////////////////////////////

package productionline;

import java.util.Date;

public abstract class Product implements Item {

  //Variables
  private static int currentProductionNumber;         //The number of the next product to be made
  private String manufacturer = Item.manufacturer;    //Initialize manufacturer to default
  private int serialNumber;                           //The number of this product
  private String name;
  private final Date manufacturedOn;
  ///////////////


  //SetGets
  public static void setProductionNumber(int number) {
    Product.currentProductionNumber = number;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
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
  ///////////////

  //Constructors

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
    serialNumber = currentProductionNumber;   //Use the number of current product
    Product.currentProductionNumber++;        //Increment class variable for next product
    manufacturedOn = new Date();
  }
  ///////////////

  //Methods

  /**
   * Overrides toString to return the manufacture, serial number, Date manufactured on, and the name
   * of the product.
   *
   * @return returns manufacturer, serial number, Date manufactured on, and name of product in
   *     format:
   *        Manufacturer    : OracleProduction
   *        Serial Number   : 012345678
   *        Date            : Fri Sep 28 10:53:30 EDT 2018
   *        Name            : Orange
   */
  @Override
  public String toString() {
    return "Manufacturer\t: " + manufacturer
        + "\nSerial Number\t: " + serialNumber
        + "\nDate\t\t\t: " + manufacturedOn
        + "\nName\t\t\t: " + name;
  }
  ///////////////
}
