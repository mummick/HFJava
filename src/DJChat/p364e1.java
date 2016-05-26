package DJChat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by lab on 26.05.16.
 */
class MyDrawPanel extends JPanel {
    public void paintComponent (Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20, 50, this.getWidth() - 40, this.getHeight() - 100);
    }
}
class SimpleGui364  {
    JButton button;
    public void go() {
        JFrame frame = new JFrame();
        MyDrawPanel draw = new MyDrawPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(draw);

        frame.setSize(300,300);

        frame.setVisible(true);
    }
}
public class p364e1 {
    public static void main(String[] args) {
        SimpleGui364 gui = new SimpleGui364();
        gui.go();
    }
}
