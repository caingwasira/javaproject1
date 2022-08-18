import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Color;

public class NamelessObjects {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Image scaledImage = new ImageIcon("src/javagui/mansion.png").getImage().getScaledInstance(100, 100, 0);
        ImageIcon image = new ImageIcon(scaledImage);

        ArrayList<JLabel> deck = new ArrayList<JLabel>();

        for(int i=0; i<50; i++) {
            deck.add(new JLabel(image));
            frame.add(deck.get(i));
        }
        frame.setSize(2000, 780);
        frame.setBackground(Color.black);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
