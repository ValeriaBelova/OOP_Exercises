package Sprint3.JFrame;

import javax.swing.*;
import java.awt.*;

public class JFlowLayout {
    public static void main(String[] args) {
        //getText - läsa ut text, setText - sätta text
        JFrame f = new JFrame("The Frame");
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        f.add(p);
        p.add(new JLabel("Hej!"));
        p.add(new JButton("Tryck här"));
        p.add(new JLabel ("Hej2!"));
        p.add(new JButton("och här"));
        p.add(new JButton("och härmed"));
        p.add(new JButton("massa knappar"));
        f.pack();
        f.setLocation(900,500);
        f.setVisible(true);
    }
}
