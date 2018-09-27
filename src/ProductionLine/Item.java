package ProductionLine;


import java.util.Date;

public interface Item {
    //Variables
    public final String manufacturer="OracleProduction";   //Set as default manufacturer


    //Method headers
    public void setProductionNumber(int number);
    public void setName(String name);
    public String getName();
    public Date getManufactureDate();
    public int getSerialNumber();
}
