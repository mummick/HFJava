package DJChat;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by lab on 26.05.16.
 */
class SimpleGui1B  implements ActionListener {
    JButton button;
    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked!");
    }
    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Click me!");

        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);

        frame.setSize(300,300);

        frame.setVisible(true);
    }
}
public class p355e1  {
    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }
}
