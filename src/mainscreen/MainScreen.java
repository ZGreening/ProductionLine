///////////////////////////////////////////////////////////////////////////////
// File: MainScreen.java
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
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import productionline.AudioPlayer;
import productionline.Main;
import productionline.MoviePlayer;
import productionline.Product;

public class MainScreen {

  @FXML
  private VBox output;

  @FXML
  private ScrollPane scrollPane;

  private void openWindow(String window) {
    int productBeforeAddition = Main.getProductsList().size();

    try {
      Stage stage = new Stage();
      Scene scene = new Scene(FXMLLoader.load(getClass().getClassLoader().getResource(window)));
      stage.setTitle("Production Line");
      stage.setScene(scene);
      stage.initModality(Modality.APPLICATION_MODAL);
      stage.showAndWait();
    } catch (Exception exception) {
      System.out.println("Unable to open " + window);
      exception.printStackTrace();
    }

    //Clear screen
    output.getChildren().clear();

    //Print number of products created
    output((Main.getProductsList().size() - productBeforeAddition) + " products created.");
    output("Total products created: " + Main.getProductsList().size());
  }

  private void output(String text) {
    Label label = new Label();
    label.setText(text);
    output.getChildren().add(label);
  }

  @FXML
  void onCreateNewMoviePlayerPressed(ActionEvent event) {
    openWindow("movieplayercreator/MoviePlayerCreator.fxml");
  }

  @FXML
  void onCreateNewAudioPlayerPressed(ActionEvent event) {
    openWindow("audioplayercreator/AudioPlayerCreator.fxml");
  }

  @FXML
  void onDisplayProductCollectionPressed(ActionEvent event) {
    //Get products list
    ArrayList<Product> products = Main.getProductsList();

    //Clear Screen
    output.getChildren().clear();

    if (products.isEmpty()) {
      output("No products created yet.");
    } else {
      //Add an entry to output for each product
      for (Product product : products) {
        output(product.toString() + "\n\n");
      }
    }

    //This was given as a way of making sure scrollpane would set its v-value properly
    scrollPane.applyCss();
    scrollPane.layout();
    scrollPane.setVvalue(1.0);
  }

  /**
   * Displays the total number of products created, the total number of each type of product, and
   * the total number of unique products. A product is considered unique product if it required
   * opening a new "Creator" window to create. If it was created because the quantity to make was
   * greater than one than it is not unique but a copy of the original.
   *
   * @param event Event passed from the button pressed
   */
  @FXML
  void onDisplayProductStatisticsPressed(ActionEvent event) {
    ArrayList<Product> products = Main.getProductsList();
    int numOfAudioPlayers = 0;
    int numOfMoviePlayers = 0;
    ArrayList<String> uniqueNames = new ArrayList<>(); //Size of uniqueNames is how many unique products

    for (Product product : products) {
      //Count number of each type of product
      if (product instanceof MoviePlayer) {
        numOfMoviePlayers++;
      } else if (product instanceof AudioPlayer) {
        numOfAudioPlayers++;
      }

      if (!uniqueNames.contains(product.getName())) {
        uniqueNames.add(product.getName());
      }
    }

    //Clear screen
    output.getChildren().clear();

    //Display statistics
    output("Total number of items produced: " + products.size());
    output("Number of movie players: " + numOfMoviePlayers);
    output("Number of audio players: " + numOfAudioPlayers);
    output("Number of unique products: " + uniqueNames.size());
  }
}
