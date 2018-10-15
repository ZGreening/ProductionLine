///////////////////////////////////////////////////////////////////////////////
// File: AudioPlayer.java
// By:   Greening, Zachary
// Date: October 12, 2018
// Description: A class representing an audio device that does not have a
//    screen
///////////////////////////////////////////////////////////////////////////////

package productionline;

public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private ItemType mediaType = ItemType.AUDIO;      //Initialize here since type is always audio


  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
  }


  @Override
  public String toString() {
    return super.toString() + "\n"
        + "Media Type : " + mediaType + "\n"
        + "Audio Specification : " + audioSpecification;
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
