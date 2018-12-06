/**
 * Author: Brandon Palomino
 * Date: 10/26/2018
 * Class: OOP JAVA
 * Filename: MovieDriver.java
 *
 */

public class MovieDriver {

    public static void testMoviePlayer() {

        MoviePlayer moviePlayer = new MoviePlayer("MoviePlayer",
                new Screen("1080", 144, 1),
                MonitorType.LCD);

        System.out.println(moviePlayer);
    }

}
