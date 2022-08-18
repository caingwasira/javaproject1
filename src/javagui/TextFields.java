package javagui;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;
import javax.swing.*;

public class TextFields extends JFrame implements ActionListener {

    JTextField textField;
    JButton button;
    TextFields() {
        textField = new JTextField();
        button = new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(this);

        textField.setPreferredSize(new Dimension(250, 40));
        textField.setBackground(Color.lightGray);
        textField.setFont(new Font("Times New Romans", Font.BOLD, 20));
        textField.setForeground(Color.white);
        textField.setCaretColor(Color.white);
        textField.setText("Enter your name...");

        this.setVisible(true);
        this.setSize(500, 600);
        this.setLayout(new FlowLayout());
        this.add(textField);
        this.add(button);
        this.setLocation(400, 100);;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println(textField.getText());
            textField.setEditable(false);
            button.setEnabled(false);
        }
    }
}
