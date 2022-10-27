package Sprint1.Inlämningsuppgift1Växter;

import javax.swing.*;

public class CactusPlants extends NamesPlants {
    final int mineralwaterPerDay = 2; //final värde av liquid för kaktus oberoende av kaktusens storlek
    private TypeOfLiquid typeOfLiquid = TypeOfLiquid.MINERALWATER;

    public CactusPlants(String name, double heightInCM){ //konstruktor
        super(name);
    }

    public TypeOfLiquid getTypeOfLiquid() { //getter
        return typeOfLiquid;
    }

    public void printOutResult() { //metod att skriva ut resultat för kaktus
        JOptionPane.showMessageDialog(null, "Kaktusen " + getName()
                + " ska ha " + mineralwaterPerDay + " cl " + getTypeOfLiquid().typeOfLiquid + " per dag.");
    }
}
