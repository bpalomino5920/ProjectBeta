/**
 * Author: Brandon Palomino
 * Date: 10/26/2018
 * Class: OOP JAVA
 * Filename: MoviePlayer.java
 *
 */


//Create a class called MoviePlayer that extends Product and implements MultimediaControl
public class MoviePlayer extends Product implements MultimediaControl,
    Comparable<Item> {

  //Add 2 fields to this class called screen and monitor type and assign appropriate types to them.
  private Screen screen;
  private MonitorType montiorType;


  public MoviePlayer(String name, Screen screen, MonitorType type) {
    super(name);
    this.screen = screen;
    this.montiorType = type;
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
    return super.toString() + "\n" +
        screen.toString() + "\n" +
        "Monitor Type: " + montiorType;
  }
}