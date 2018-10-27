/**
 * Author: Brandon Palomino
 * Date: 9/28/2018
 * Class: OOP JAVA
 * Filename: main.java
 *
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {

  //Write one line of code to create an ArrayList of products
    ArrayList<Product> products = new ArrayList<>();

  //Write one line of code to call testCollection and assign the result to the ArrayList
    products = testCollection();

  //Write one line of code to sort the ArrayList
    Collections.sort(products);

  //Call the print method on the ArrayList
    print(products);

  }

// Complete the header for the testCollection method here
  public static ArrayList<Product> testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");

    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");

    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",

        new Screen(" 720x480", 40, 22), MonitorType.LCD);

    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",

        new Screen("1366x768", 40, 22), MonitorType.LED);

// Write one line of code here to create the collection

    ArrayList<Product> products = new ArrayList<>();

    products.add(a1);

    products.add(a2);

    products.add(m1);

    products.add(m2);

    return products;
  }

// Create print method here
  public static void print(ArrayList<Product> products) {
    for (Product p : products) {
      System.out.println(p);

    }

  }

}
