package Sprint3.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Övning1aVäxlaBild extends JFrame implements ActionListener {
    JPanel p = new JPanel();
    JLabel l = new JLabel();
    JButton b = new JButton("Växla bild");

    public Övning1aVäxlaBild() {
        p.setLayout(new FlowLayout());
        b.addActionListener(this);
        this.add(p);
        p.add (l);
        p.add (b);
        setTitle("Övning1aVäxlaBild");
        setVisible(true);
        setSize(1000,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        l.setIcon(new ImageIcon("src/Sprint3/JFrame/bild1.jpg"));
        l.setIcon(new ImageIcon("src/Sprint3/JFrame/bild2.jpg"));
        p.add(l);
        add(p);
        validate();
    }


    public static void main(String[] args) {
        Övning1aVäxlaBild bild = new Övning1aVäxlaBild();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (l.getText().equalsIgnoreCase("Hej!")){
            l.setText("Hopp");
        }
        else{
            l.setText("Hej!");
        }
    }

}
