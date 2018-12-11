import java.util.Date;

public class AudioPlayer extends Product implements MultimediaControl {

  //The class will have 2 fields
  private String audioSpecification;
  private ItemType mediaType;

  /**
   * Initializes AudioPlayer.
   * @param name
   * @param audioSpecification
   */
  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = ItemType.Audio;
  }


  //Implement the methods from the MultimediaControl interface by
  // simply writing the action to the console
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

  //Create a toString method that will display the superclasses toString method, but also add rows
  // for Audio Spec and Type.

  public String toString() {

    return super.toString() + "\n"
        + "Audio Spec : " + audioSpecification + "\n"
        + "Type : " + mediaType;


  }

  @Override
  public Date getManufactureDate() {
    return null;
  }

  @Override
  public void setManufacturer(String m) {

  }
}