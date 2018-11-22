///////////////////////////////////////////////////////////////////////////////
// File: MainScreenController.java
// By:   Greening, Zachary
// Date: November 21, 2018
// Description: The Controller class for the MainScreen.fxml file
///////////////////////////////////////////////////////////////////////////////

package productionline;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainScreenController {

  private ArrayList<Product> products = new ArrayList<>();

  /*
  Create a program that would allow a user to Add a new product and to specify how many items of
  that product should be created. The program will then create these items and store them in a
  collection. The collection can be displayed at any time. New Products can be added at any time.
  Production statistics can be displayed – Total items produced, number of each item, the number
  of unique products created etc. The operator will decide when to stop the program. The program
  will be menu driven and can either be a console program or with a richer graphical user interface.
  */

  @FXML
  private Label output;

  @FXML
  private TextField quantity;

  @FXML
  void onAddProductPressed(ActionEvent event) {

  }

  @FXML
  void onDisplayProductCollectionPressed(ActionEvent event) {

  }

  @FXML
  void onDisplayProductStatisticsPressed(ActionEvent event) {

  }
}
