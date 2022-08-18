package lambda;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {

    JButton button = new JButton("Click Me");
    
    MyFrame() {

        button.setBounds(100, 100, 100, 100);
        button.setAlignmentX(50);
        button.addActionListener((e) -> {
            System.out.println("YOU CLICKED A BUTTON");
        });

        this.add(button);
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
    }
}
