package Sprint1.Ovningar.Övning2;

public class Huvudprogram {

    public void printFordon(Fordon fordon){
        fordon.printMe();
    }


    public Huvudprogram(){
        Bil bil = new Bil(200, 1200, 16);
        Båt båt = new Båt(50, 300, 50);
        Cykel cykel = new Cykel(20, 5, 4);
        Tåg tåg = new Tåg(100, 9800,6);

        Fordon f = new Cykel(15,7, 3);

        printFordon(bil);
        printFordon(båt);
        printFordon(cykel);
        printFordon(tåg);

        printFordon(f);

        //System.out.println();


    }

    public static void main(String[] args) {
        Huvudprogram hp = new Huvudprogram();
    }
}