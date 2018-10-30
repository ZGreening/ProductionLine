///////////////////////////////////////////////////////////////////////////////
// File: MoviePlayerDriver.java
// By:   Greening, Zachary
// Date: October 15, 2018
// Description: A test driver class for productionline.MoviePlayer
///////////////////////////////////////////////////////////////////////////////

package productionline;

public class MoviePlayerDriver {

  /**
   * A driver class to test the functionality of the productionline.MoviePlayer class.
   */
  public static void testMoviePlayer() {
    MoviePlayer moviePlayer = new MoviePlayer("iPad",
        new Screen("1366x768", 60, 15), MonitorType.LCD);

    System.out.println(moviePlayer);
    System.out.println();

    moviePlayer.next();
    moviePlayer.previous();
    moviePlayer.play();
    moviePlayer.stop();
  }
}
