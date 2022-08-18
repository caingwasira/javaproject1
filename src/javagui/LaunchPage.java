package javagui;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");

    LaunchPage() {
        button.setBounds(200, 200, 300, 100);
        button.addActionListener(this);

        frame.setVisible(true);
        frame.add(button);
        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.setLocation(300, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            NewWindow window = new NewWindow();
            frame.dispose();
        }
        
    }
}
