package Sprint3.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//händelsestyrt program(ligger programmet och väntar på olika händelse som kan inträffa (användare skriver något, klickar på knappen, etc)
public class JCheckBoxDemo extends JFrame implements ActionListener {
    private JPanel p = new JPanel();
    private JCheckBox red = new JCheckBox("Röd", false);
    private JCheckBox blue = new JCheckBox("Blue", false);
    private JCheckBox yellow = new JCheckBox("Yellow", false);
    private JLabel displayArea = new JLabel(" ");

    public JCheckBoxDemo() { //konstruktor för klassen JCheckBoxDemo
        p.setLayout(new GridLayout(4,1)); //man talar om för fönstret vilken LayoutManager som sköter om själva utplaceringen av komponenterna i fönstret

        p.add(red); p.add(blue); p.add(yellow); p.add(displayArea);
        add(p);
        //här nedan anropas metoden addActionListener för var och en av de tre knapparna
        //som argument anger man vilket objekt som skall vara lyssnare till händelser som inträffar i den komponent det gäller
        //argumentet "this" betyder att det aktuella objektet (JButtonDemo då) själv skall vara lyssnare.
        red.addActionListener (this);
        blue.addActionListener (this);
        yellow.addActionListener (this);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
//metoden getSource används för att få reda på vilken knapp användaren klickade på
//resultattypen från denna metod är av typen Object och vi placerar resultatet i en variabel som vi kallar b för att slippa anropa metoden flera gånger
    @Override
    public void actionPerformed(ActionEvent e) { //metoden har en parameter e som är av klassen ActionEvent definierat i paketet java.awt.event
        if (e.getSource() == red) { //metoden e.getSource returnerar det objekt där händelsen inträffade
            p.setBackground(Color.red);
            displayArea.setText("Du valde rött");
        }
        else if (e.getSource() == blue) {
            p.setBackground(Color.blue);
            displayArea.setText("Du valde blått");
        }
        else if (e.getSource() == yellow) {
            p.setBackground(Color.yellow);
            displayArea.setText("Du valde gult");
        }
    }

    public static void main(String[] args) {
        //i metoden main skapas ett objekt av klassen JCheckBoxDemo
        JCheckBoxDemo ch = new JCheckBoxDemo();
    }
}
