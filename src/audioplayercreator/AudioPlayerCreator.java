package audioplayercreator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import productionline.AudioPlayer;
import productionline.Main;

public class AudioPlayerCreator {

  @FXML
  private TextField productName;

  @FXML
  private TextField productSpecification;

  @FXML
  private TextField quantity;

  @FXML
  private Label output;

  @FXML
  private AnchorPane root;

  @FXML
  void onCreatePressed(ActionEvent event) {
    String name = productName.getText();
    String specification = productSpecification.getText();
    int quantity;

    try {
      quantity = Integer.parseInt(this.quantity.getText());
    } catch (Exception exception) {
      quantity = -1; //error
    }

    if (name.isEmpty()) {
      output.setText("Name must not be empty");
    } else if (specification.isEmpty()) {
      output.setText("Specification must not be empty");
    } else if (quantity < 0) {
      output.setText("Quantity must be a number");
    } else if (quantity == 0) {
      output.setText("Quantity must be greater than 0");
    } else {
      for (int iii = 0; iii < quantity; iii++) {
        AudioPlayer audioPlayer = new AudioPlayer(name, specification);
        Main.addProduct(audioPlayer);
        Main.addToNumberOfUniqueProducts();
      }

      Stage stage = (Stage) root.getScene().getWindow();
      stage.close();
    }
  }
}
