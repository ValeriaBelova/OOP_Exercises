package Sprint1.Ovningar.Övning2;

public class Cykel extends Fordon{
    private int antalVäxlar;
    private int antalHjul = 2;// vi kan deklarera variabel direkt här om det finns behov
    //int växelJustNu;

    public Cykel(int hastighet, int vikt, int antalVäxlar){ //skapar metod med parametrar
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;

        //public void trampa(){}
    }

    public int getAntalVäxlar() { //generate Getter som returnerar värde
        return antalVäxlar;
    }

    public int getAntalHjul() { // generate Getter som returnerar värde
        return antalHjul;
    }

    public void printMe(){ //ny metod att skriva ut data, inte returnera något värde
        System.out.println("Cykel med hastighet " + getHastighet() + "km/h, vikt " + getVikt() + "kg och antal växlar: " + antalVäxlar);
    }



}
