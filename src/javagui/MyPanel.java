package javagui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.plaf.PanelUI;

public class MyPanel extends JPanel implements ActionListener {
    final int PANEL_WIDTH = 600;
    final int PANEL_HEIGHT = 600;
    Image backgroundImage;
    Image image;
    Timer timer;
    int xVelocity = 4;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel() {
        backgroundImage = new ImageIcon("src/javagui/mansion.png").getImage().getScaledInstance(500, 500, 0);
        image = new ImageIcon("joypad.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        this.setBounds(400, 100, PANEL_WIDTH, PANEL_HEIGHT);
        this.setBackground(Color.black);
        
        timer = new Timer(5, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(backgroundImage, 40, 0, null);
        g2.drawImage(image, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >= PANEL_WIDTH-image.getWidth(null) || x<0) xVelocity *= -1;
        x = x + xVelocity;

        if(y >= PANEL_HEIGHT-image.getHeight(null) || y<0) yVelocity *= -1;
        y = y + yVelocity;
        repaint();
    }
}
