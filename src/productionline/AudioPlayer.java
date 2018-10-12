///////////////////////////////////////////////////////////////////////////////
// File: AudioPlayer.java
// By:   Greening, Zachary
// Date: October 12, 2018
// Description: A class representing an audio device that does not have a
//    screen
//
///////////////////////////////////////////////////////////////////////////////

package productionline;

public class AudioPlayer extends Product implements MultimediaControl {

  //Variables
  String audioSpecification = "NotAssigned";
  ItemType mediaType = ItemType.AUDIO;
  ///////////////

  //Constructor
  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
  }
  ///////////////

  //Methods
  @Override
  public String toString() {
    return super.toString() + "\n"
        + "Media Type           : " + mediaType + "\n"
        + "Audio Specification  : " + audioSpecification;
  }

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Playing Previous");
  }

  @Override
  public void next() {
    System.out.println("Playing Next");
  }
}
