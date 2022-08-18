package javagui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuBars extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, helpMenu;
    JMenuItem loadItem, saveItem, exitItem;
    ImageIcon loadIcon;

    MenuBars() {

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        
        loadIcon = new ImageIcon("src/javagui/me.jpg");

        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);
        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        loadItem.setIcon(loadIcon);

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        this.setJMenuBar(menuBar);
        this.setSize(500, 600);
        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.setLocation(300, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loadItem) System.out.println("File loaded!");

        if(e.getSource() == saveItem) System.out.println("File saved!");

        if(e.getSource() == exitItem) System.exit(0);
    }
}
