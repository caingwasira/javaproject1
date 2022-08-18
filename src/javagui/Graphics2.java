package javagui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Image;
import javax.swing.*;

public class Graphics2 extends JPanel {
    Image image;
    Graphics2() {
        image = new ImageIcon("src/javagui/mansion.png").getImage();
        this.setBackground(Color.gray);
        this.setPreferredSize(new Dimension(1500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.drawImage(image, 0, 0, null);

        g2.setPaint(new Color(0x123456));
        g2.setStroke(new BasicStroke(5));
        g2.drawLine(100, 100, 700, 70);
        g2.fillRect(700, 20, 100, 50);

        g2.fillOval(1200, 100, 100, 100);
        g2.fillArc(1150, 500, 100, 100, 180, 250);
        int[] xPoints = {100, 200, 50};
        int[] yPoints = {100, 200, 220};
        g2.fillPolygon(xPoints, yPoints, 3);
        g2.fillRect(40, 500, 90, 90);

        g2.setPaint(Color.magenta);
        g2.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2.drawString("Done:", 600, 400);
    }
}
