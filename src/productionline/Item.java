///////////////////////////////////////////////////////////////////////////////
// File: Item.java
// By:   Greening, Zachary
// Date: September 28, 2018
// Description: An interface with a default manufacturer and basic methods
//      relating to an productionline.Item
///////////////////////////////////////////////////////////////////////////////

package productionline;

import java.util.Date;

public interface Item {

  public final String manufacturer = "OracleProduction";   //Set as default manufacturer

  //Must provide body for static function
  public static void setProductionNumber(int number) {
  }

  public String getName();

  public void setName(String name);

  public Date getManufactureDate();

  public int getSerialNumber();
}
