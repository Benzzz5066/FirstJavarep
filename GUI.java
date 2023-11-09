import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {
    private int clicks = 0;
    private JLabel label = new JLabel("Number of Cookies:  0     ");
    private JFrame frame = new JFrame();

    public GUI() {

        // the clickable button
        JButton button = new JButton("Click Me For Free Cookie");
        button.addActionListener(this);

        // the panel with the button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 30, 50));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Cookie Clicker v1");
        frame.pack();
        frame.setVisible(true);
    }

    // process the button clicks
    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("+1 cookies:  " + clicks );
    }

    // create one Frame
    public static void main(String[] args) {
        new GUI();
    }
}