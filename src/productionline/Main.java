///////////////////////////////////////////////////////////////////////////////
// File: Main.java
// By:   Greening, Zachary
// Date: October 12, 2018
// Description: The driver class for Production Line application
///////////////////////////////////////////////////////////////////////////////

package productionline;

import java.util.ArrayList;
import java.util.Collection;
import javafx.application.Application;
import javafx.stage.Stage;
import productionline.Product.SortByName;

public class Main extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
  }

  public static void main(String[] args) {
    ArrayList<Product> arrayList;

    arrayList = testCollection();

    print(arrayList);
    arrayList.sort(new SortByName());
    print(arrayList);

    //AudioPlayerDriver.testAudioPlayer();
    //ScreenDriver.testScreen();
    //MoviePlayerDriver.testMoviePlayer();
    //MultimediaControlDriver.testMultimediaControlArray();
    //launch(args);
  }

  public static <T> T testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    ArrayList<Product> products = new ArrayList<>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return (T) products;
  }

  public static <T> void print(Collection<T> collection) {
    for (T product : collection) {
      System.out.println(product);
    }
  }
}
