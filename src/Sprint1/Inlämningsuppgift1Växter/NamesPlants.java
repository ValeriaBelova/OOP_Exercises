package Sprint1.Inlämningsuppgift1Växter;

public abstract class NamesPlants implements PrintOutResult { //implementerar Interface
    String name;


    NamesPlants(String name) { //konstruktor
        this.name = name;
    }

    @Override
    public void printOutResult() { //skuggar (override) metoden från Interfacet
    }

    public String getName() { //genererade getter
        return name;
    }

    public void setName(String name) { //genererade setter
        this.name = name;
    }
}
