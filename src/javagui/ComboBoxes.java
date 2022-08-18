package javagui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxes extends JFrame implements ActionListener {
    String[] animals = {"dog", "cow", "lion", "pig"};
    JComboBox comboBox = new JComboBox(animals);
    ComboBoxes() {
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.pack();
        this.add(comboBox);
        comboBox.addActionListener(this);
        //comboBox.getItemCount();
        comboBox.addItem("horse");
        comboBox.insertItemAt("zebra", 0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("lion");
        comboBox.removeItemAt(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox) {
            System.out.println(comboBox.getItemAt(2));
        }
    }
}
