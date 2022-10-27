package Sprint1.Inlämningsuppgift1Växter;

public class TypePlants { //skapade en ny klass att samla typer av växter
    String p = "Palmen";
    String kv = "Köttätande växten";
    String k = "Kaktusen";

    public final String typePlants; //final eftersom värdena på växttyper ska inte ändras

    public TypePlants(String typePlants) { //konstruktor
        this.typePlants = typePlants;

    }
}
