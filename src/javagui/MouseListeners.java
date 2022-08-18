package javagui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListeners extends JFrame implements MouseListener {

    JLabel label;
    MouseListeners() {
        label = new JLabel();
        label.setBounds(20, 20, 300, 200);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocation(300, 200);
        this.setLayout(null);
        this.add(label);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setBackground(Color.green);
        System.out.println("Mouse clicked!");
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setBackground(Color.blue);
        System.out.println("Mouse pressed!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setBackground(Color.gray);
        System.out.println("Mouse released!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setBackground(Color.orange);
        System.out.println("Mouse Entered!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setBackground(Color.black);
        System.out.println("Mouse exited!");
    }
}
