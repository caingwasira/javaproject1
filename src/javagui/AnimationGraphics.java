package javagui;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

public class AnimationGraphics extends JFrame {
    MyPanel panel;

    AnimationGraphics() {
        panel = new MyPanel();
        this.setVisible(true);
        this.setSize(2000, 780);
        this.setBackground(Color.black);
        this.setLayout(null);
        this.add(panel);
    }
}
