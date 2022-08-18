package javagui;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptionPanes {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("src/javagui/me.jpg");
        String[] responses = {"Just a little!", "Not much", "Who doesnt drink beer these days?"};
        JOptionPane.showMessageDialog(null, 
        "Whats up bro", 
        "Greeting", 
        JOptionPane.CLOSED_OPTION);

        JOptionPane.showConfirmDialog(null, 
        "Are you a nerd?", "Survey Questions", JOptionPane.YES_NO_OPTION);

        JOptionPane.showOptionDialog(null, 
        "Do you drink beer?", 
        "Survey Questions", 
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        icon, 
        responses, 
        0);
    }
}
