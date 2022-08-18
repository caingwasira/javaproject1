package javagui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Welcome User");
    NewWindow() {

        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.add(label);
    }
}
