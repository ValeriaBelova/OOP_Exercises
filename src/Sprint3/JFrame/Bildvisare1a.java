package Sprint3.JFrame;

import javax.swing.*;
import java.awt.*;

public class Bildvisare1a extends JFrame {
    //deklarerar bara
    JPanel panel;
    JLabel imageViewer;
    JButton changeImageButton;

    String imagePath = "src/Sprint3/JFrame/bild1.jpg";

    public Bildvisare1a() {
        changeImageButton = new JButton("Change image");// tilldelar värde till en ny knapp
        imageViewer = new JLabel(new ImageIcon(imagePath)); // label tilldelas vägen till image
        panel = new JPanel(); // skapar en ny Panel
        panel.setLayout(new FlowLayout()); // väljer layout för vår frame
        panel.setBackground(Color.BLUE); //väljer färg
        panel.add(imageViewer); //adderar imageViewer till panelen
        panel.add(changeImageButton); //adderar knappen till panelen
        this.add(panel); //ska användas precis denna panel
        setSize(800,600); //väljer size
        setVisible(true); //ska synas
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Bildvisare1a b = new Bildvisare1a();
    }

}
