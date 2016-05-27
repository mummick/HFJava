package DJChat;

import javax.swing.*;

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
