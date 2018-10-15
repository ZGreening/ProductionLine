///////////////////////////////////////////////////////////////////////////////
// File: MoviePlayer.java
// By:   Greening, Zachary
// Date: October 15, 2018
// Description: A concrete class that represents a movie player which has
//    the functionality of a multimedia device and a screen
///////////////////////////////////////////////////////////////////////////////

package productionline;

public class MoviePlayer extends Product implements MultimediaControl{
  private Screen screen;
  private MonitorType monitorType;


  public MoviePlayer(String name, Screen screen, MonitorType monitorType)
  {
    super(name);
    this.screen=screen;
    this.monitorType=monitorType;
  }

  @Override
  public void play() {
    System.out.println("Playing Movie");
  }

  @Override
  public void stop() {
    System.out.println("Stopping Movie");
  }

  @Override
  public void previous() {
    System.out.println("Playing Previous Scene");
  }

  @Override
  public void next() {
    System.out.println("Playing Next Scene");
  }

  @Override
  public String toString(){
    return super.toString()+"\n"
        +screen+"\n"
        +"Monitor Type : "+monitorType;
  }
}
