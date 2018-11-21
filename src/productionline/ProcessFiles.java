///////////////////////////////////////////////////////////////////////////////
// File: ProcessFiles.java
// By:   Greening, Zachary
// Date: November 21, 2018
// Description: A class for writing files with either an employee or a list
//    of products.
///////////////////////////////////////////////////////////////////////////////

package productionline;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProcessFiles {

  //For a mac, this is /Users/*username*/LineTests
  private Path path = Paths.get(System.getProperty("user.home") + "/LineTests");
  private Path path2 = Paths.get("TestResults.txt");
  private Path path3 = path.resolve(path2);

  public ProcessFiles() {
    createDirectory();
  }

  private void createDirectory() {
    try {
      if (!Files.exists(path)) {
        Files.createDirectory(path); //Create Directory
      } else if (!Files.exists(path3)) {
        Files.createFile(path3);     //Create file in new directory
      }
    } catch (IOException exception) {
      System.out.println("Unable to create file/path: " + path3);
      exception.printStackTrace();
    }
  }

  /**
   * An overloaded method that appends the information of an employee to the bottom of the file
   * TestResults.txt.
   *
   * @param employeeInfo The employee info to write
   * @throws IOException If the file was unable to write, throw IOException
   */
  public void writeFile(EmployeeInfo employeeInfo) throws IOException {
    File file = new File(path3.toString());
    OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file, true),
        StandardCharsets.UTF_8);
    PrintWriter printWriter = new PrintWriter(writer);
    printWriter.append(employeeInfo.toString());
    printWriter.append("\n\n");
    printWriter.close();
  }

  /**
   * A overloaded method that appends a list of products to the bottom of the file TestResults.txt.
   *
   * @param products the list of products to be appended
   * @throws IOException If the file was unable to write, throw IOException
   */
  public void writeFile(ArrayList<Product> products) throws IOException {
    File file = new File(path3.toString());
    OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file, true),
        StandardCharsets.UTF_8);
    PrintWriter printWriter = new PrintWriter(writer);

    for (Product product : products) {
      printWriter.append(product.toString());
      printWriter.append("\n\n");
    }

    printWriter.close();
  }
}
