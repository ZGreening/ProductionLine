///////////////////////////////////////////////////////////////////////////////
// File: AudioPlayerDriver.java
// By:   Greening, Zachary
// Date: October 12, 2018
// Description: A driver class for productionline.AudioPlayer
///////////////////////////////////////////////////////////////////////////////

package productionline;

public class AudioPlayerDriver {

  /**
   * A test driver function for testing the functionality of the class productionline.AudioPlayer.
   */
  public static void testAudioPlayer() {
    AudioPlayer ipod1 = new AudioPlayer("My Ipod", "Song 1");

    //Test toString Method
    System.out.println(ipod1);

    System.out.println();     //empty line

    //Test other methods of type productionline.AudioPlayer
    ipod1.play();
    ipod1.stop();
    ipod1.previous();
    ipod1.next();
  }
}
