/**
 * Author: Brandon Palomino
 * Date: 10/26/2018
 * Class: OOP JAVA
 * Filename: DriverScreen.java
 *
 */
//Create a Driver class for Screen that tests the functionality of the screen class
public class DriverScreen {

    public static void testScreen() {

        Screen screen = new Screen("1080", 60, 1);
        System.out.println(screen);
    }

}