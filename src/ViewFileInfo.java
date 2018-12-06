/**
 * Author: Brandon Palomino
 *
 * Date: 12/05/2018
 *
 * Class: OOP JAVA
 *
 * Filename: ViewFileInfo.java
 *
 */
import java.io.FileReader;

//Create a driver class named ViewFileInfo that will read the information from the TestResults.txt file and
//display the contents to the console
public class ViewFileInfo {

    public static void main(String[] args){

        try {
            FileReader fr =
                    new FileReader("C:\\LineTests\\TestResults.txt");

            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
        } catch (Exception ex) {
            System.out.println("File reader can't read");
        }
    }
}