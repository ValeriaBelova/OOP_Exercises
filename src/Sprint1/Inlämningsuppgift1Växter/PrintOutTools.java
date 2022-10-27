package Sprint1.Inlämningsuppgift1Växter;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PrintOutTools {

    public List<NamesPlants> CheckinPlants() { //ny metod för Listan
        List<NamesPlants> greenest = new ArrayList<>(); //skapar Listan och adderar de som bor på hotellet
        greenest.add(0, new CactusPlants("Igge", 20));
        greenest.add(1, new PalmTrees("Laura", 5));
        greenest.add(2, new CarnivorousPlants("Meatloaf", 0.7));
        greenest.add(3, new PalmTrees("Putte", 1));
        return greenest; //sparar och returnerar värdena
    }

    public void printMe(List<NamesPlants> listIn) { //ny metod att skapa dialogrutor
        while (true) { //loop
            try {
                String ownerInput = JOptionPane.showInputDialog(null, "Välkommen till växthotellet Greenest!" +
                        "\nVilken växt ska få mat? "); //frågar owner att ange namn på den växt som ska få mat

                if (ownerInput.equalsIgnoreCase("Avbryt/Cancel")) {//avsluta programmet om kommer ingen input
                    break;
                }
                int counter = 0; //sätter räknare som ska gå genom vår lista av växter, tilldelar default värde 0
                for (NamesPlants element : listIn) {
                    if (ownerInput.equalsIgnoreCase(element.getName())) {//när räknaren hittar rätt värde, så skriver ut det
                        element.printOutResult();
                        counter++;
                        break;
                    }
                }
                if (counter == 0) {//så länge namnet inte stämmer - fråga om owner igen
                    JOptionPane.showMessageDialog(null, ownerInput + " bor inte på Greenest hotell. Skriv namnet på nytt.");
                }
            } catch(NullPointerException e) {
                    System.exit(0);
            }

        }

    }
}