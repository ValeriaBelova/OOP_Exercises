package Sprint3.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MouseLyssnare extends JFrame {
    JButton b = new JButton("Röd");

    public MouseLyssnare() {
        setLayout(new FlowLayout());
        add(b);
        b.addMouseListener(musLyssnare);
        setSize(300,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    MouseAdapter musLyssnare = new MouseAdapter() {

        @Override
        public void mouseEntered(MouseEvent e) {
            if (e.getComponent() == b);
            b.setBackground(Color.red);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (e.getComponent() == b);
            b.setBackground(Color.lightGray);
        }
    };

    public static void main(String argv[]) {
        new MouseLyssnare();
    }

}
