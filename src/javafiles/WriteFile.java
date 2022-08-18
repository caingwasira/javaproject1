package javafiles;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("src/javafiles/message.txt");
            writer.write("Well, have you guessed my name?");
            writer.append("\nFinally, now you know my name");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
