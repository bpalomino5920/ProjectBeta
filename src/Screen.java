/**
 * Author: Brandon Palomino
 * Date: 10/26/2018
 * Class: OOP JAVA
 * Filename: Screen.java
 *
 */


//Create a class called Screen that implements ScreenSpec. Add three fields
public class Screen implements ScreenSpec {

  protected int refreshrate;
  protected int responsetime;
  protected String resolution;

  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  @Override
  public String getResolution() {
    return resolution;
  }

  @Override
  public int getRefreshRate() {
    return refreshrate;
  }

  @Override
  public int getResponseTime() {
    return responsetime;
  }

  public String toString() {
    return "Resolution: " + resolution + "\n" +
        "Refresh Rate: " + refreshrate + "\n" +
        "Response Time: " + responsetime;
  }
}