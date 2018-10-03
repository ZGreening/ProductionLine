///////////////////////////////////////////////////////////////////////////////
// File: Main.java
// By:   Greening, Zachary
// Date: September 28, 2018
// Description: The driver class for Production Line application
//
///////////////////////////////////////////////////////////////////////////////

package productionline;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
  }

  public static void main(String[] args) {
    AudioPlayer ipod=new AudioPlayer("My Ipod","Song 1");
    System.out.println(ipod);

    System.out.println("");

    ipod.play();
    ipod.stop();
    ipod.previous();
    ipod.next();

    launch(args);
  }
}

