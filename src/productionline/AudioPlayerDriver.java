///////////////////////////////////////////////////////////////////////////////
// File: AudioPlayerDriver.java
// By:   Greening, Zachary
// Date: October 12, 2018
// Description: A driver class for AudioPlayer
//
///////////////////////////////////////////////////////////////////////////////

package productionline;

public class AudioPlayerDriver {

  public static void main(String[] args) {
    AudioPlayer ipod = new AudioPlayer("My Ipod", "Song 1");
    System.out.println(ipod);

    System.out.println("");

    ipod.play();
    ipod.stop();
    ipod.previous();
    ipod.next();

    System.out.println("");

    System.out.println(ipod);
  }
}
