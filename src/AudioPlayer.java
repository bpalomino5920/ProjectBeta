/**
 * Author: Brandon Palomino
 * Date: 9/28/2018
 * Class: OOP JAVA
 * Filename: AudioPlayer.java
 *
 */

//We require a concrete class that will allow us to capture the details of an audio player. Create a class
//called AudioPlayer that is a subclass of Product and implements the MultimediaControl interface.
public class AudioPlayer extends Product implements MultimediaControl, Comparable<Item> {

  //The class will have 2 fields
  protected String audioSpecification; //Create a constructor that will take in 2 parameters – name and audioSpecification.
  protected ItemType mediaType;


  //The constructor should call its parents constructor and also setup the media type
  public AudioPlayer(String name, String specification) {
    super(name);
    audioSpecification = specification;
    mediaType = ItemType.AU;
  }

  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stopped");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }

  public String toString() {
    String str = super.toString() + "\n";
    str += "Audio Specification: " + audioSpecification + "\n" + "Type: " + mediaType;
    return str;
  }
}