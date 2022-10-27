package Sprint3.JFrame;

import javax.swing.*;

public class JFrameDemo extends JFrame {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Hej!");
    JButton button = new JButton ("Tryck här");


    JFrameDemo() {
        setSize(300, 300); //rutans storlek
        setLocation(1000, 500); //location på skärmen
        setVisible(true);// om false då gömmer sig men syns inte
        setDefaultCloseOperation(EXIT_ON_CLOSE); //stänger om trycker på Close
    }

    public static void main(String[] args) {
        JFrameDemo f = new JFrameDemo();
    }

}
