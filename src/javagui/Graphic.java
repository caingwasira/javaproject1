package javagui;

import javax.swing.*;
import java.awt.*;

public class Graphic extends JFrame {
    Graphics2 panel;
    Graphic() {
        panel = new Graphics2();
        this.setVisible(true);
        this.setSize(2000, 750);
        this.add(panel);
    }
}
