/**
 * Author: Brandon Palomino
 * Date: 9/29/2018
 * Class: OOP JAVA
 * Filename: ItemType.java
 *
 */

//Create an enum called ItemType that will store
// the following information. AUDIO, VISUAL, AudioMobile, VisualMobile
  // changed form on 10/26
public enum ItemType {

  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISUAL_MOBILE("VM");

  public String code;

  ItemType(String code) {
    this.code = code;
  }
}

