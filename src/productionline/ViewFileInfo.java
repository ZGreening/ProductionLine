///////////////////////////////////////////////////////////////////////////////
// File: ViewFileInfo.java
// By:   Greening, Zachary
// Date: October 12, 2018
// Description: A driver class to read the information of TestResults.txt
///////////////////////////////////////////////////////////////////////////////

package productionline;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ViewFileInfo {

  private Path path = Paths.get(System.getProperty("user.home") + "/LineTests");
  private Path path2 = Paths.get("TestResults.txt");
  private Path path3 = path.resolve(path2);

  /**
   * Reads the contents of the file TestResults.txt and prints them to the console.
   */
  public void readFile() {
    try {
      File file = new File(path3.toString());
      Scanner scanner = new Scanner(file, "UTF-8");

      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }
    } catch (IOException exception) {
      System.out.println("Unable to read file: " + path3);
      exception.printStackTrace();
    }
  }
}
