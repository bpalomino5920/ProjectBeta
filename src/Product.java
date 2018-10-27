/**
 * Author: Brandon Palomino
 * Date: 9/28/2018
 * Class: OOP JAVA
 * Filename: Product.java
 *
 */

import java.util.Date;

public class Product implements Item,
    Comparable<Item> {

  protected int serialNumber;
  protected String manufacturer;
  protected Date manufacturedOn;
  protected String name;

  private static int currentProductionNumber = 1;

  public Product(String name) {
    setName(name);
    currentProductionNumber++;
    setProductionNumber(currentProductionNumber);
    manufacturer = MANUFACTURER;
    manufacturedOn = new Date();
  }

  //set product number
  public void setProductionNumber(int prodNumber) {
    serialNumber = prodNumber;
  }

  //set name
  public void setName(String name) {
    this.name = name;

  }

  // get names
  public String getName() {
    return name;
  }

  //get Manufacture
  public Date getManufactureDate() {
    return manufacturedOn;
  }

  //get Serial Number
  public int getSerialNumber() {
    return serialNumber;
  }

  // Output information
  public String toString() {
    String str = "Manufacturer: " + manufacturer + "\n";
    str += "Serial Number: " + serialNumber + "\n";
    str += "Date: " + manufacturedOn + "\n";
    str += "Name: " + name;
    return str;

  }
  public int compareTo(Item o) {
    return name.compareTo(o.getName()); //comparing Names
  }
}