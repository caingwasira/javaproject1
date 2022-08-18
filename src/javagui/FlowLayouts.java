package javagui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class FlowLayouts {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));
        frame.add(panel);
        panel.setLayout(new FlowLayout());

        panel.setBackground(Color.lightGray);
        panel.setPreferredSize(new Dimension(150, 250));

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));

    }
}
