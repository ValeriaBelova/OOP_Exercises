package Sprint1.Inlämningsuppgift1Växter;


public class MainProgram{ //huvudprogram

    public static void main(String[] args) { //main metod
        PrintOutTools printOutTools = new PrintOutTools(); //skapar plats för PrintOutTools klass i minnet
        printOutTools.printMe(printOutTools.CheckinPlants());//inkapsling

    }
}
