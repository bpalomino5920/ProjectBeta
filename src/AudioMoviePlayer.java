/**
 * Author: Brandon Palomino
 *
 * Date: 10/31/2018
 *
 * Class: OOP JAVA
 * Filename: AudioMoviePlayer.java
 *
 */

import java.util.ArrayList;

public class AudioMoviePlayer {

    public static void testPlayer() {
        MoviePlayer moviePlayer = new MoviePlayer("Pyle PDV156BK",
                new Screen("1366x768", 40, 22),
                MonitorType.LED);

        AudioPlayer audioPlayer = new AudioPlayer("Walkman",
                "MP4");

        System.out.print(moviePlayer);

        ArrayList<MultimediaControl> arrayList = new ArrayList<>();

        arrayList.add(audioPlayer);
        arrayList.add(moviePlayer);

        for (MultimediaControl element : arrayList) {

            element.next();
            element.play();
            element.previous();
            element.stop();
        }
    }
}
