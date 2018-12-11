import java.util.Date;

public class MoviePlayer extends Product implements MultimediaControl {

  //Add 2 fields to this class called screen and monitor type and assign appropriate types to them

  Screen screen;

  MonitorType monitorType;

  //Complete the methods from the MultimediaControl interface.

  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {

    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stopping");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }

  //Create a toString method that calls the product toString

  public String toString() {
    return super.toString() + "\nScreen : " + screen + "\n"
        + "Monitor Type : " + monitorType;
  }

  @Override
  public Date getManufactureDate() {
    return null;
  }

  @Override
  public void setManufacturer(String m) {

  }
}