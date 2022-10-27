package Sprint1.Inlämningsuppgift1Växter;

import javax.swing.*;

public class PalmTrees extends NamesPlants implements HeightInMeters { //arv och interface
    public double heightInMeters;
    private TypeOfLiquid typeOfLiquid = TypeOfLiquid.TAPWATER; //plockar värde från enums

    public PalmTrees(String name, double heightInMeters){ //konstruktor
        super(name);
        this.heightInMeters = heightInMeters;
    }

    public double getTapWaterPerDay(){ //metod att beräkna Liquid för palmer
        double tapWaterPerDay = 0.5 * heightInMeters;
        return tapWaterPerDay;
    }

    public TypeOfLiquid getTypeOfLiquid() { //getter
        return typeOfLiquid;
    }

    @Override
    public double getHeightInMeters() { //getter
        return heightInMeters;
    }
    @Override
    public void setHeightInMeters(double heightInMeters) { //setter
        this.heightInMeters = heightInMeters;
    }
//tack vare polymorfism kan vi via våra referenser komma åt flera metoder som finns deklarerade
    public void printOutResult() { //metod att skriva ut resultat efter beräkningarna
        JOptionPane.showMessageDialog(null, "Palmen " + getName()
                + " är " + heightInMeters + " meter hög och ska ha " + getTapWaterPerDay() + " liter " + getTypeOfLiquid().typeOfLiquid + " per dag.");
    }
}
