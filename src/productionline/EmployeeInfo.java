///////////////////////////////////////////////////////////////////////////////
// File: EmployeeInfo.java
// By:   Greening, Zachary
// Date: October 31, 2018
// Description: A class to represent an employee. The class will generate
//    a user code based on their name input.
///////////////////////////////////////////////////////////////////////////////

package productionline;

import java.util.Scanner;

public class EmployeeInfo {

  StringBuilder name;
  String code;

  public EmployeeInfo() {
    name = new StringBuilder(inputName());
    createEmployeeCode(name);
  }

  public StringBuilder getName() {
    return name;
  }

  public void setName(StringBuilder name) {
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  /**
   * Gets First and last name from user in one line. Name entered is Expected to have a first name
   * followed by a space and a last name. FIND_BUGS INTERNANALIZATION: RELIANCE ON DEFAULT ENCODING
   *
   * @return returns the full string entered by user
   */
  public String inputName() {
    String fullName;

    System.out.println("Enter First and Last Name: ");
    Scanner scanner = new Scanner(System.in);

    fullName = scanner.nextLine();

    return fullName;
  }

  /**
   * Checks whether or not the StringBuilder passed contains a space.
   *
   * @param name StringBuilder to be checked
   * @return returns true if it has a space, false otherwise.
   */
  public boolean checkName(StringBuilder name) {
    return name.lastIndexOf(" ") >= 0;
  }

  /**
   * Generates and sets the employee code. Employee code contains the first initial of their first
   * name, and their full last name. Expected format for the StringBuilder is "firstname lastname".
   *
   * @param name the name of the employee for the code to be generated with
   */
  private void createEmployeeCode(StringBuilder name) {
    StringBuilder stringBuilder = new StringBuilder();
    if (checkName(name)) {
      stringBuilder.append(name.charAt(0));
      stringBuilder.append(name.substring(name.indexOf(" ")+1));
      code = stringBuilder.toString();
    } else {
      code = "guest";
    }
  }
}