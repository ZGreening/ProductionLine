///////////////////////////////////////////////////////////////////////////////
// File: ScreenDriver.java
// By:   Greening, Zachary
// Date: October 12, 2018
// Description: A driver class for class productionline.Screen
///////////////////////////////////////////////////////////////////////////////

package productionline;

public class ScreenDriver {

  /**
   * A driver class to test the functionality of the testScreen class.
   */
  public static void testScreen() {
    Screen screen = new Screen("800x600", 60, 98);

    //Test toString
    System.out.println(screen);

    System.out.println();

    //Test function calls
    System.out.println(screen.getRefreshRate());
    System.out.println(screen.getResolution());
    System.out.println(screen.getResponseTime());
  }
}
