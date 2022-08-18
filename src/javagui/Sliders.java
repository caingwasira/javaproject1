package javagui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Sliders implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    Sliders() {
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);
        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        slider.setOrientation(SwingConstants.HORIZONTAL);
        slider.addChangeListener(this);
        slider.setBackground(Color.black);

        label.setText(slider.getValue()+" degrees");

        panel.add(slider);
        panel.add(label);
        frame.add(panel);

        frame.setVisible(true);
        frame.setSize(600, 650);
        frame.setLocation(300, 50);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource() == slider) label.setText(slider.getValue()+" degrees");
    }
}
