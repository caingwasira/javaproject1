package javagui;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class AudioPlayer {
    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("audio.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String action = "";
        while(!action.equals("Q")) {
            System.out.println("P=play  S=stop R=reset Q=quit");
            action = scanner.next();
            action = action.toUpperCase();
            switch(action) {
                case "P": clip.start();
                break;
                case "S": clip.stop();
                break;
                case "R": clip.setMicrosecondPosition(0);
                break;
                case "Q": clip.close();
                break;
                default: System.out.println("Invalid option");
            }
        } System.out.println("Byeee");
        
    }
}
