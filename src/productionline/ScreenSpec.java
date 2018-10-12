///////////////////////////////////////////////////////////////////////////////
// File: ScreenSpec.java
// By:   Greening, Zachary
// Date: October 12, 2018
// Description: An interface that defines methods related to a screen's
//    specification.
//
///////////////////////////////////////////////////////////////////////////////

package productionline;

public interface ScreenSpec {

  public String getResolution();

  public int getRefreshRate();

  public int getResponseTime();

}
