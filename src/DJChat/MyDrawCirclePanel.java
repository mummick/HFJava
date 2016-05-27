package DJChat;

import javax.swing.*;
import java.awt.*;

/**
 * Created by lab on 27.05.16.
 */
public class MyDrawCirclePanel extends JPanel {
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
