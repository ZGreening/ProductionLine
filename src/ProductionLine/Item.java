package ProductionLine;


import java.util.Date;

public interface Item {
    //Variables
    final String manufacturer="OracleProduction";   //Set as default manufacturer


    //Method headers
    void setProductionNumber(int number);
    void setName(String name);
    String getName();
    Date getManufactureDate();
    int getSerialNumber();
}
