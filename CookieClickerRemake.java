import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CookieClickerRemake implements ActionListener {
    private int clicks = 0;
    private JLabel label = new JLabel("Number of Cookies:  0     ");
    private JFrame frame = new JFrame();

    public CookieClickerRemake() {

        // the clickable button
        Icon icon = new ImageIcon("C:\\Users\\stell\\OneDrive\\Desktop\\cookie\\cookie.jpg");
        JButton button = new JButton(icon);
        button.setMaximumSize(new Dimension(40, 40));
        
        button.addActionListener(this);
        //maybe add icon.actionlistener if possible so you can forget about the button

        // the panel with the button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(25, 25, 15, 25));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Cookie Clicker v1");
        frame.pack();
        frame.setSize(295,495);
        frame.setVisible(true);

        
    }

    // process the button clicks
    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("+1 cookies:  " + clicks );
        
    }

    // create one Frame
    public static void main(String[] args) {
        new CookieClickerRemake();
    }
}