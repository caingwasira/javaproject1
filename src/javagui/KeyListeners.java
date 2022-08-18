package javagui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListeners extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon1, icon2;

    KeyListeners() {
        label = new JLabel();
        icon1 = new ImageIcon("src/javagui/mansion.png");
        icon2 = new ImageIcon("bear.png");

        label.setBounds(100, 100, 100, 100);
        //label.setOpaque(true);
        label.setBackground(Color.darkGray);
        //label.setForeground(Color.white);
        label.setIcon(icon2);

        this.addKeyListener(this);
        this.setVisible(true);
        this.setSize(600, 600);
        this.setLocation(300, 100);
        this.setLayout(null);
        this.add(label);
        //this.setIconImage(icon1);
    }

    @Override
    public void keyTyped(KeyEvent e) {
       switch(e.getKeyChar()) {
        case 'a' : label.setLocation(label.getX()-10, label.getY());
        break;
        case 'd' : label.setLocation(label.getX()+10, label.getY());
        break;
        case 'w' : label.setLocation(label.getX(), label.getY()-10);
        break;
        case 's' : label.setLocation(label.getX(), label.getY()+10);
       }
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //label.setText("The key char pressed: "+ e.getKeyChar()+" and code: "+e.getKeyCode());
        System.out.println(e.getKeyCode());
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //label.setText("The key char released: "+ e.getKeyChar()+" and code: "+e.getKeyCode());
        
    }
}
