package javagui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxes extends JFrame implements ActionListener {
    JCheckBox checkBox;
    JButton button;
    CheckBoxes() {
        checkBox = new JCheckBox();
        button = new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(this);
        button.setEnabled(false);

        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 15));
        checkBox.addActionListener(this);
        checkBox.setBackground(Color.black);
        checkBox.setForeground(Color.white);
        //checkBox.setIcon(xIcon);
        //checkBox.setSelectedIcon(checkIcon);

        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.setSize(500, 500);
        this.add(checkBox);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == checkBox && checkBox.isSelected()) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }

        if(e.getSource() == button) button.setEnabled(true);
    }
}
