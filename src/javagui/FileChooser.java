package javagui;

import javax.swing.JFrame;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.File;

public class FileChooser extends JFrame implements ActionListener {
    JButton button;
    FileChooser() {
        button = new JButton("Load File...");
        button.addActionListener(this);


        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(new BorderLayout());
        this.setLocation(300, 200);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("C:\\Users\\Ellisa\\Desktop"));
            int response = fileChooser.showOpenDialog(null);
            if(response == fileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}
