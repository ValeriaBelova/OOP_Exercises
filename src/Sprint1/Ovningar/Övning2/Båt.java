package Sprint1.Ovningar.Övning2;

public class Båt extends Fordon{
    private int dödvikt; //jag adderade private

    public Båt(int hastighet, int vikt, int dödvikt){ //metoden innehåller Fordon parameter + sin egen dödvikt
        super(hastighet, vikt); // tar de två parametrar från superklass Fordon
        this.dödvikt = dödvikt;//tar data från denna parameter som finns bara i denna klass Båt
    }

    public void Sväng(){} //ny metod som inte innehåller nåt än

    public void printMe(){ //ny metod att skriva ut data, inte returnera något värde
        System.out.println("Båt med hastighet " + getHastighet() + "km/h, vikt " + getVikt() + "kg och dödvikt: " + dödvikt);
    }
}
