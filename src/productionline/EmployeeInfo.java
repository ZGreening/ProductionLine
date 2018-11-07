///////////////////////////////////////////////////////////////////////////////
// File: EmployeeInfo.java
// By:   Greening, Zachary
// Date: October 31, 2018
// Description: A class to represent an employee. The class will generate
//    a user code based on their name input.
///////////////////////////////////////////////////////////////////////////////

package productionline;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {

  StringBuilder name;
  String code;
  String deptId;
  Pattern pattern;
  Scanner in;

  /**
   * Constructor for the class Employee Info. The constructor initializes the Scanner with
   * system.in. It also initializes a pattern for a department ID. The constructor then gets the
   * name of the employee and creates the employee code. Finally, it gets the department ID from the
   * user.
   */
  public EmployeeInfo() {
    this.in = new Scanner(System.in);
    this.pattern = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");

    setName();
    createEmployeeCode(name);

    setDeptId();

    this.in.close();
  }

  //Private Methods
  private String getDeptId() {
    System.out.println("Department ID: ");
    String deptId = in.nextLine();
    return deptId;
  }

  private void setDeptId() {
    String id = getDeptId();

    if (validId(id)) {
      this.deptId = id;
    } else {
      this.deptId = "None01";
    }
  }

  private void setName() {
    name = new StringBuilder(inputName());
  }

  private boolean validId(String id) {
    System.out.println(Pattern.matches(pattern.pattern(), id));
    return Pattern.matches(pattern.pattern(), id);
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
      stringBuilder.append(name.substring(name.indexOf(" ") + 1));
      code = stringBuilder.toString();
    } else {
      code = "guest";
    }
  }

  /**
   * Checks whether or not the StringBuilder parameter contains a space.
   *
   * @param name StringBuilder to be checked
   * @return returns true if it has a space, false otherwise.
   */
  private boolean checkName(StringBuilder name) {
    return name.indexOf(" ") >= 0;
  }

  /**
   * Gets First and last name from user in one line. Name entered is Expected to have a first name
   * followed by a space and a last name. FIND_BUGS INTERNANALIZATION: RELIANCE ON DEFAULT ENCODING
   *
   * @return returns the full string entered by user
   */
  private String inputName() {
    System.out.println("Please enter your first and last name: ");
    String name = in.nextLine();
    return name;
  }

  /**
   * A recursive method that reverses a string "id" passed to it. It takes the first char off of the
   * string and appends it to the end of the remaining string. It then calls recursively with that
   * substring.
   *
   * @param id the string to be reveresed
   * @return after recursion, the reversed string is returned.
   */
  public String reverseString(String id) {
    if (id.length() <= 1) {
      return id; //last char
    } else {
      return reverseString(id.substring(1)) + id
          .charAt(0); //substring after first char + first char
    }
  }

  //Public Methods
  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  public String getId() {
    return deptId;
  }

  @Override
  public String toString() {
    return "name : " + getName() + "\n"
        + "code : " + getCode() + "\n"
        + "deptId : " + getId();
  }
}
