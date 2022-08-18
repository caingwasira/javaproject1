package javagui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBars {
    JFrame frame;
    JProgressBar bar;
    ProgressBars() {
        frame = new JFrame();
        bar = new JProgressBar(0, 500);
        bar.setBounds(20,20,700,40);
        bar.setValue(0);
        bar.setStringPainted(true);
        bar.setBackground(Color.black);

        frame.setVisible(true);
        frame.setSize(900,600);
        frame.setLocation(200, 100);
        frame.setLayout(null);
        frame.add(bar);

        fill();
    }

    public void fill() {
        int counter = 0;
        while(counter <= 500) {
            bar.setValue(counter);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            counter+=10;
        }
        bar.setString("Done:");
    }
}
