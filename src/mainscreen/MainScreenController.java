///////////////////////////////////////////////////////////////////////////////
// File: MainScreenController.java
// By:   Greening, Zachary
// Date: November 21, 2018
// Description: The Controller class for the MainScreen.fxml file
///////////////////////////////////////////////////////////////////////////////

package mainscreen;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import productionline.Product;

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

  private void openWindow(String window) {
    try {
      Stage stage = new Stage();
      Scene scene = new Scene(FXMLLoader.load(getClass().getClassLoader().getResource(window)));
      stage.setTitle("Production Line");
      stage.setScene(scene);
      stage.initModality(Modality.APPLICATION_MODAL);
      stage.show();
    } catch (Exception exception) {
      System.out.println("Unable to open " + window);
      exception.printStackTrace();
    }
  }

  @FXML
  void onCreateNewMoviePlayerPressed(ActionEvent event) {

  }

  @FXML
  void onCreateNewAudioPlayerPressed(ActionEvent event) {

  }

  @FXML
  void onDisplayProductCollectionPressed(ActionEvent event) {

  }

  @FXML
  void onDisplayProductStatisticsPressed(ActionEvent event) {

  }
}
