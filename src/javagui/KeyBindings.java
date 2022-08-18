package javagui;

import java.awt.event.*;
import java.security.Key;
import javax.swing.*;
import java.awt.*;

public class KeyBindings {

    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    JFrame frame;
    JLabel label;
    ImageIcon icon;

    KeyBindings() {

        frame = new JFrame("key binding demo");
        label = new JLabel();
        upAction = new upAction();
        downAction = new downAction();
        leftAction = new leftAction();
        rightAction = new rightAction();
        icon = new ImageIcon("src/javagui/mansion.png");

        label.setBounds(100, 100, 1200, 600);
        label.setOpaque(true);
        label.setBackground(Color.black);
        label.setIcon(icon);

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        label.getActionMap().put("upAction", upAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction", downAction);

        label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
        label.getActionMap().put("leftAction", leftAction);

        label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(2000, 790);
        frame.add(label);

    }

    public void upAct() {
        label.setLocation(label.getX(), label.getY()-20);
    }

    public class upAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()-20);
            System.out.println("Going up");
            
        }
        
    }

    public class leftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-20, label.getY());
            
        }

    }

    public class rightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+20, label.getY());
            
        }
        
    }

    public class downAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()+10);
            
        }
        
    }
}
