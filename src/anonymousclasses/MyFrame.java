package anonymousclasses;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {

    JButton button1 = new JButton("Button #1");
    JButton button2 = new JButton("Button #2");
    JButton button3 = new JButton("Button #3");
    
    MyFrame() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed button #1");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed button #2");
            }
        });

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.setVisible(true);
        this.setSize(700, 500);
        this.setLocation(400,100);
        this.setLayout(new FlowLayout());
    }
}
