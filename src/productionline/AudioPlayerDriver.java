///////////////////////////////////////////////////////////////////////////////
// File: AudioPlayerDriver.java
// By:   Greening, Zachary
// Date: October 12, 2018
// Description: A driver class for productionline.AudioPlayer
///////////////////////////////////////////////////////////////////////////////

package productionline;

public class AudioPlayerDriver {

  /**
   * A test driver function for testing the functionality of the class AudioPlayer.
   */
  public static void testAudioPlayer() {
    AudioPlayer iPod = new AudioPlayer("My iPod", "Song 1");

    //Test toString Method
    System.out.println(iPod);

    System.out.println();     //empty line

    //Test other methods of type AudioPlayer
    iPod.play();
    iPod.stop();
    iPod.previous();
    iPod.next();
  }
}
