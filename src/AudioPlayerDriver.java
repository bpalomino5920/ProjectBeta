/**
 * Author: Brandon Palomino
 *
 * Date: 11/12/2018
 *
 * Class: OOP JAVA
 *
 * Filename: AudioPlayerDriver.java
 *
 */

class AudioPlayerDriver {

    public static void testAudioPlayer() {
        AudioPlayer audioPlayer = new AudioPlayer("iPod Mini", "MP3");

        audioPlayer.play();
        audioPlayer.stop();
        audioPlayer.next();
        audioPlayer.previous();

        System.out.print(audioPlayer);

        AudioPlayer audioPlayer1 = new AudioPlayer("Walkman", "WAV");

        System.out.println(audioPlayer1);
    }
}