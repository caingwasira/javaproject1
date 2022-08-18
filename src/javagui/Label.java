package javagui;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;

public class Label {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("src/javagui/me.jpg");
        Border border = BorderFactory.createLineBorder(Color.white, 1);

        JLabel label = new JLabel();
        label.setText("Resource Manager");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0xffffff));
        label.setIconTextGap(10);
        label.setBackground(new Color(0x000000));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(5,5,650,650);


        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(new Color(0x123456));
        frame.setLocation(400, 100);
        frame.setTitle("Orelle Technologies");
        frame.add(label);
        frame.setLayout(null);
    }
}
