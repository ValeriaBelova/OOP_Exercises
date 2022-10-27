package Sprint3.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Uppg2Bensinförbrukning extends JFrame implements ActionListener {
    JPanel panel;
    private JTextField mätarställningNu = new JTextField();
    private JTextField mätarställningEttÅrSedan = new JTextField();
    private JTextField bensinAntalLiter = new JTextField();
    private JLabel l1 = new JLabel("Ange mätarställning nu:", JLabel.RIGHT);
    private JLabel l2 = new JLabel("Ange mätarställning för ett år sedan:", JLabel.RIGHT);
    private JLabel l3 = new JLabel("Ange antal liter förbrukad bensin:", JLabel.RIGHT);
    private JPanel p = new JPanel(); //övre delen
    private JLabel result = new JLabel(); //undre delen

    public Uppg2Bensinförbrukning() {
        setLayout(new GridLayout(3,2));
        add(p);//panelen överst
        add(result); //resultattexten underst

        //placera ut komponenterna i fönstrets övre halva
        p.setLayout(new GridLayout(3,2)); //3 rader 2 kolumner
        p.add(l1); p.add(mätarställningNu);
        p.add(l2); p.add(mätarställningEttÅrSedan);
        p.add(l3); p.add(bensinAntalLiter);

        //koppla ihop formulären och ange kortkommandon
        l1.setLabelFor(mätarställningNu);
        l2.setLabelFor(mätarställningEttÅrSedan);
        l3.setLabelFor(bensinAntalLiter);

        pack(); //beräkna fönstrets storlek
        //ange vilken lyssnare som skall användas
        mätarställningNu.addActionListener(this);
        mätarställningEttÅrSedan.addActionListener(this);
        bensinAntalLiter.addActionListener(this);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // läs mätarställning nu
        Scanner scan1 = new Scanner(mätarställningNu.getText());
        double mätarställningNuDouble = scan1.nextDouble();

        // läs mätarställning för ett år sedan
        Scanner scan2 = new Scanner(mätarställningEttÅrSedan.getText());
        double mätarställningEttÅrSedanDouble = scan2.nextDouble();

        // läs mätarställning nu
        Scanner scan3 = new Scanner(bensinAntalLiter.getText());
        double bensinAntalLiterDouble = scan3.nextInt();

        //beräkna och visa Antal körda mil
        double antalKördaMil = mätarställningNuDouble - mätarställningEttÅrSedanDouble;
        double bensinPerMil = bensinAntalLiterDouble / antalKördaMil;
        String s1 = String.format("Antal körda mil: %.2f\u20AC", antalKördaMil);
        String s2 = String.format("Antal liter bensin: ", bensinAntalLiterDouble);
        String s3 = String.format("Förbrukning per mil: ", bensinPerMil);

        result.setText(s1);
        result.setText(s2);
        result.setText(s3);
    }

    public static void main(String[] args) {
        Uppg2Bensinförbrukning u = new Uppg2Bensinförbrukning();
    }
}
