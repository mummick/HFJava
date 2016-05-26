package DJChat;

import javax.swing.*;
import java.awt.*;

class MyDrawCirclePanel extends JPanel {
    public Color randomColor() {
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color rColor = new Color(red, green, blue);
        return rColor;
    }

    public void paintComponent (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
        GradientPaint gradient = new GradientPaint(70, 70, randomColor(), this.getWidth() - 140, this.getHeight() - 140, randomColor());
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, this.getWidth() - 140, this.getHeight() - 140);
    }
}
class SimpleGui365  {
    public void go() {
        JFrame frame = new JFrame();
        MyDrawCirclePanel draw = new MyDrawCirclePanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(draw);

        frame.setSize(300,300);

        frame.setVisible(true);
    }
}
public class p365e1 {
    public static void main(String[] args) {
        SimpleGui365 gui = new SimpleGui365();
        gui.go();
    }
}
