package javagui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("Fleet Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setResizable(false);

        ImageIcon image = new ImageIcon("src/javagui/me.jpg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(55,95,250));
    }
}
