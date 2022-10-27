package Sprint3.JFrame;

import javax.swing.*;
import javax.swing.text.FlowView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class JButtonDemoWithListener extends JFrame implements ActionListener {
    JLabel label = new JLabel("Hej!");
    JButton button = new JButton("Tryck här");

    JButtonDemoWithListener() {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        button.addActionListener(this);
        this.add(p);
        p.add (label);
        p.add (button);
        this.pack();
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (label.getText().equalsIgnoreCase("Hej!")){
            label.setText("Hopp");
        }
        else{
            label.setText("Hej!");
        }
    }

    public static void main(String[] args) {
        JButtonDemoWithListener b = new JButtonDemoWithListener();
    }
}
