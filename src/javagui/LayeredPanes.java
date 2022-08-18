package javagui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.*;

public class LayeredPanes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLayeredPane");
        JLayeredPane layeredPane = new JLayeredPane();

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBounds(50,50,200,200);
        label1.setBackground(Color.red);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBounds(100,100,200,200);
        label2.setBackground(Color.blue);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBounds(150,150,200,200);
        label3.setBackground(Color.green);

        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.add(layeredPane);

        layeredPane.setBounds(0,0,500,500);
        layeredPane.setBackground(Color.lightGray);
        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(1));
        layeredPane.add(label3, Integer.valueOf(2));
    }
}
