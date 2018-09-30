/**
 * Author: Brandon Palomino
 * Date: 9/28/2018
 * Class: OOP JAVA
 * Filename: ItemType.java
 *
 */


//Create an enum called ItemType that will store
// the following information.
public enum ItemType {

  // ItemType AUDIO = new ItemType ("AU");
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VISIUAL_MOBILE("VM");

  private final String code;

  ItemType(String code){
    this.code = code;
  }

  public String getCode(){
    return code;
  }

}
