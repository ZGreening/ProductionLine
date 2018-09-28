///////////////////////////////////////////////////////////////////////////////
//
// File: Product.java
// By:   Greening, Zachary
// Date: September 28, 2018
// Description: A class that implements interface item that has general
//      attributes and methods relating to a product
//
///////////////////////////////////////////////////////////////////////////////

package ProductionLine;


import java.util.Date;

public abstract class Product implements Item {
    //Variables
    private static int currentProductionNumber;     //The number of the next product to be made
    private String manufacturer = Item.manufacturer;  //Initialize manufacturer to default
    private int serialNumber;                       //The number of this product
    private String name;
    private Date manufacturedOn;


    //SetGets
    public void setProductionNumber(int number) {
        currentProductionNumber = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getManufactureDate() {
        return manufacturedOn;
    }

    public int getSerialNumber() {
        return serialNumber;
    }


    /**
     * Constructor to create a product and initialize its name, serial number
     * and date manufactured on. Increments the class variable
     * currentProductionNumber to prepare it for the next, not yet made,
     * product
     *
     * @param name the name of the product being created
     */
    public Product(String name) {
        this.name = name;
        serialNumber = currentProductionNumber;   //Use the number of current product
        currentProductionNumber++;              //Increment for next product
        manufacturedOn = new Date();
    }


    /**
     * Overrides toString to return the manufacture, serial number, Date manufactured
     * on, and the name of the product
     *
     * @return returns manufacturer, serial number, Date manufactured on, and
     * name of product in format:
     * <p>
     * Manufacturer    : OracleProduction
     * Serial Number   : 012345678
     * Date            : Fri Sep 28 10:53:30 EDT 2018
     * Name            : Orange
     */
    @Override
    public String toString() {
        return "Manufacturer\t: " + manufacturer + "\nSerial Number\t: " + serialNumber +
                "\nDate\t\t\t: " + manufacturedOn + "\nName\t\t\t: " + name;
    }
}
