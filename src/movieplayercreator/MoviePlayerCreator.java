package movieplayercreator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import productionline.Main;
import productionline.MonitorType;
import productionline.MoviePlayer;
import productionline.Screen;

public class MoviePlayerCreator {

  @FXML
  private TextField productName;

  @FXML
  private TextField resolution;

  @FXML
  private TextField refreshRate;

  @FXML
  private TextField responseTime;

  @FXML
  private TextField monitorType;

  @FXML
  private TextField quantity;

  @FXML
  private Label output;

  @FXML
  private AnchorPane root;

  @FXML
  void onCreatePressed(ActionEvent event) {
    String name = productName.getText();
    MonitorType type = null;
    String resolution = null;
    int refreshRate;
    int responseTime;
    int quantity;

    //If a valid
    if (this.resolution.getText().matches("[0-9]{3,4}x[0-9]{3,4}")) {
      resolution = this.resolution.getText();
    }

    //Set monitor type
    if (monitorType.getText().toUpperCase().equals("LCD")) {
      type = MonitorType.LCD;
    } else if (monitorType.getText().toUpperCase().equals("LED")) {
      type = MonitorType.LED;
    }

    //Get quantity
    try {
      quantity = Integer.parseInt(this.quantity.getText());
    } catch (Exception exception) {
      quantity = -1; //error
    }

    //Get refresh rate
    try {
      refreshRate = Integer.parseInt(this.refreshRate.getText());
    } catch (Exception exception) {
      refreshRate = -1; //error
    }

    //Get refresh rate
    try {
      responseTime = Integer.parseInt(this.responseTime.getText());
    } catch (Exception exception) {
      responseTime = -1; //error
    }

    if (name.isEmpty()) {
      output.setText("Name must not be empty");
    } else if (resolution == null) {
      output.setText("Make sure resolution is valid:\n0000x0000, 000x000, or 0000x000");
    } else if (refreshRate < 0) {
      output.setText("Refresh rate must be a number");
    } else if (refreshRate == 0) {
      output.setText("Refresh rate must not be zero");
    } else if (responseTime < 0) {
      output.setText("Response time must be a number");
    } else if (responseTime == 0) {
      output.setText("Response time must not be zero");
    } else if (type == null) {
      output.setText("Make sure monitor type is valid:\nLCD or LED");
    } else if (quantity < 0) {
      output.setText("Quantity must be a number");
    } else if (quantity == 0) {
      output.setText("Quantity must not be zero");
    } else {
      for (int iii = 0; iii < quantity; iii++) {
        MoviePlayer moviePlayer = new MoviePlayer(name,
            new Screen(resolution, refreshRate, responseTime), type);
        Main.addProduct(moviePlayer);
      }

      //Close Window
      Stage stage = (Stage) root.getScene().getWindow();
      stage.close();

    }
  }
}
