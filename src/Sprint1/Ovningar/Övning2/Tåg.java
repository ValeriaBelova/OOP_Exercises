package Sprint1.Ovningar.Övning2;

import java.sql.SQLOutput;

public class Tåg extends Fordon {
    private int antalVagnar;

    public Tåg(int hastighet, int vikt, int antalVagnar){
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    public void kopplaVagn(){ //void för att returnerar inget värde
    }

    public void printMe(){
        System.out.println("Tåg med hastighet " + getHastighet() + "km/h, vikt " + getVikt() + "kg och antal vagnar: " + antalVagnar);
    }

    public int getAntalVagnar() {
        return antalVagnar;
    }
}
