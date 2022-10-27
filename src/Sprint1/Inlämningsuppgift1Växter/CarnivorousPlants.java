package Sprint1.Inlämningsuppgift1Växter;

import javax.swing.*;

public class CarnivorousPlants extends NamesPlants implements HeightInMeters { //en arv (extends); interface (implements)
    public double heightInMeters; //implementerar (hämtar) metod från Interface
    private TypeOfLiquid typeOfLiquid = TypeOfLiquid.PROTEINDRINK; //deklarerar och plockar värde från enums

    public CarnivorousPlants(String name, double heightInMeters){ //konstruktor
        super(name);//plockar namn från superklass NamesPlants
        this.heightInMeters = heightInMeters; //plockar värde från Interface
    }

    public double getProteindrinkPerDag() { //metod att beräkna Liquid per dag för köttätande växt
        double proteindrinkPerDag = 0.1 + (0.2 * heightInMeters);
        return proteindrinkPerDag;
    }

    public TypeOfLiquid getTypeOfLiquid() { //getter
        return typeOfLiquid;
    }

    @Override //återanvändning av metod från Interface
    public double getHeightInMeters() { //getter
        return heightInMeters;
    }
    @Override
    public void setHeightInMeters(double heightInMeters) { //setter
        this.heightInMeters = heightInMeters;
    }

    public void printOutResult() { //metod att skriva ut resultat i dialogrutan
        JOptionPane.showMessageDialog(null, " Köttätande växten " + getName()
                + " är " + heightInMeters + " meter hög och ska ha " + getProteindrinkPerDag() + " liter " + getTypeOfLiquid().typeOfLiquid + " per dag.");
    }
}


