package OvningarLektioner.Scanner;

import java.util.Scanner;

public class BensinforbrukningScanner {

    Scanner sc = new Scanner(System.in);
    protected double getInParam(String Message) {
        while (true) {
            System.out.println(Message);
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                sc.next();
            }
        }
    }

    public double calculateDistanceDrivenDuringLastYear(double mätarställningNu, double mätarställningFörraÅret){ //konstruktor
        return mätarställningNu - mätarställningFörraÅret;
    }

    public double calculateAverageGasUsage(double gasUsedLastYear, double distanceDrivenLastYear){
        return gasUsedLastYear / distanceDrivenLastYear;
    }

    public String printDistanceDrivenDuringLastYear(double distanceDrivenDuringLastYear){
        return "Antal körda mil: " + distanceDrivenDuringLastYear;
    }

    public String printGasUsedLastYear(double gasUsedLastYear){
        return "Antal liter bensin: " + gasUsedLastYear;
    }

    public String printAverageGasUsage(double averageGasUsage){
        return "Förbrukning per mil: " + averageGasUsage;
    }

    public void mainProgram(){

        double mätarställningNu = getInParam("Ange mätarställning: ");
        //double mätarställningNu = Double.parseDouble(JOptionPane.showInputDialog("Ange mätarställning: ").trim());
        double mätarställningFörEttÅrSen = getInParam("Ange mätarställning för ett år sen: ");
        //double mätarställningFörEttÅrSen = Double.parseDouble(JOptionPane.showInputDialog("Ange mätarställning för ett år sen: ").trim());
        double gasUsedLastYear = getInParam("Ange bensinförbrukning under året: ");
        //double gasUsedLastYear = Double.parseDouble(JOptionPane.showInputDialog("Ange bensinförbrukning under året: ").trim());

        double distanceDrivenDuringLastYear = calculateDistanceDrivenDuringLastYear(mätarställningNu, mätarställningFörEttÅrSen);
        double averageGasUsage = calculateAverageGasUsage(distanceDrivenDuringLastYear, gasUsedLastYear);

        System.out.println(printDistanceDrivenDuringLastYear(distanceDrivenDuringLastYear));
        System.out.println(printGasUsedLastYear(gasUsedLastYear));
        System.out.println(printAverageGasUsage(averageGasUsage));
    }


    public static void main(String[] args) {
        BensinforbrukningScanner n = new BensinforbrukningScanner();
        n.mainProgram();
    }
}
