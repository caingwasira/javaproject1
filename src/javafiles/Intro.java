package javafiles;
import java.io.File;
public class Intro {
    public static void main(String[] args) {
        File file = new File("src/javafiles/message.txt");
        if(file.exists()) {
            System.out.println(file.getAbsolutePath());
        } else {
            System.out.println("File doesnt exist");
        }
    }
}
