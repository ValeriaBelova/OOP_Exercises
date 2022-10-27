package Sprint3.JFrame;

import javax.swing.*;

public class JButtonDemoNoListener extends JFrame {
    JLabel label = new JLabel("Hej!");
    JButton button = new JButton("Tryck här");

    JButtonDemoNoListener() {
        JPanel p = new JPanel();
        this.add(p);
        p.add(label);
        p.add(button);
        this.pack();
        this.setLocation(1000, 500);
        //this.setSize(300, 300); ta bort size för att pack ska göra sin grej
        this.setVisible (true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
