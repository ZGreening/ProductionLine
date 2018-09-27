package ProductionLine;


import java.util.Date;

public abstract class Product implements Item
{
    //Variables
    private static int currentProductionNumber;     //The number of the next product to be made
    private String manufacturer=Item.manufacturer;  //Override default manufacturer
    private int serialNumber;                       //The number of this product
    private String name;
    private Date manufacturedOn;


    //SetGets
    public void setProductionNumber(int number) {currentProductionNumber=number;}
    public void setName(String name) {this.name=name;}
    public String getName() {return name;}
    public Date getManufactureDate() {return manufacturedOn;}
    public int getSerialNumber() {return serialNumber;}


    //Constructor
    public Product(String name)
    {
        this.name=name;
        serialNumber=currentProductionNumber;   //Use the number of current product
        currentProductionNumber++;              //Increment for next product
        manufacturedOn=new Date();
    }


    //Methods
    public String toString()
    {
        return "Manufacturer\t: "+manufacturer+"\nSerial Number\t: "+serialNumber+
                "\nDate\t\t\t: "+manufacturedOn+"\nName\t\t\t: "+name;
    }
}
