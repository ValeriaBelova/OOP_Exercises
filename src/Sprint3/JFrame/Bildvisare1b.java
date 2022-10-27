package Sprint3.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bildvisare1b extends JFrame implements ActionListener {
    //deklarerar bara
    JPanel panel;
    JLabel imageViewer;
    JButton changeImageButton;

    String imagePath1 = "src/Sprint3/JFrame/bild1.jpg";
    String imagePath2 = "src/Sprint3/JFrame/bild2.jpg"; //!!!!!!!!!!!! lägger till ett till path, till image2!
    int toggler = 0;

    public Bildvisare1b () { //konstruktor
        changeImageButton = new JButton("Change image");// tilldelar värde till en ny knapp
        imageViewer = new JLabel(new ImageIcon(imagePath1)); // label tilldelas vägen till image1
        imageViewer.setPreferredSize(new Dimension(300,300)); //!!!!!!! definierar storlek på imageViewer!
        panel = new JPanel(); // skapar en ny Panel
        panel.setLayout(new FlowLayout()); // väljer layout för vår frame
        //placerar ut texten/knappar, etc
        panel.setBackground(Color.BLUE); //väljer färg
        panel.add(imageViewer); //adderar imageViewer till panelen
        panel.add(changeImageButton); //adderar knappen till panelen
        this.add(panel); //ska användas precis denna panel
        changeImageButton.addActionListener(this);// !!!!!!!!! möjlighet att trycka på knappen flera gånger!
        //setSize(800,600); //väljer size
        pack();
        setVisible(true); //ska synas
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //lyssnarmetod
    @Override
    public void actionPerformed(ActionEvent e) {
        if(toggler == 0){
            imageViewer.setIcon(new ImageIcon(imagePath1));
            toggler = 1;
        }
        else if (toggler == 1){
            imageViewer.setIcon(new ImageIcon(imagePath2));
            toggler = 0;
        }
    }

    public static void main(String[] args) {
        Bildvisare1b b = new Bildvisare1b();
    }
}
