package DJChat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by lab on 27.05.16.
 */
class SimpleGui3C implements ActionListener {
    JFrame frame;
    public void actionPerformed(ActionEvent event) {
        frame.repaint();
    }
    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);

        MyDrawCirclePanel draw = new MyDrawCirclePanel();
        frame.getContentPane().add(BorderLayout.CENTER, draw);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
public class p371e1 {
    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }
}
