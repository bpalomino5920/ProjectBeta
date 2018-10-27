/**
 * Author: Brandon Palomino
 * Date: 9/28/2018
 * Class: OOP JAVA
 * Filename: Item.java - Interface file
 *
 */

import java.util.Date;

public interface Item {

  public static final String MANUFACTURER = "OracleProduction";

  public void setProductionNumber(int prodNumber);

  public void setName(String name);

  public String getName();

  public Date getManufactureDate();

  public int getSerialNumber();
}