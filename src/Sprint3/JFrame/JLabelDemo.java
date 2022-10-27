package Sprint3.JFrame;

import javax.swing.*;
import java.awt.*;

public class JLabelDemo extends JFrame {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Hej!");

    JLabelDemo () {
        setLayout(new FlowLayout());
        add(panel);
        panel.add(label);
        setSize(300, 300); //rutans storlek
        setLocation(1000, 500); //location på skärmen
        setVisible(true);// om false då gömmer sig men syns inte
        setDefaultCloseOperation(EXIT_ON_CLOSE); //stänger om trycker på Close

    }
}
