package Sprint1.Ovningar.Ovning1;

public class Huvudprogram {
    private static void printBil(Bil bil){
        if (bil.getBilägare() == null){
            System.out.println("Bilen med regNummer" + bil.getRegNummer() + " har ingen ägare");
        }
        else {
            System.out.println("Bilen med regNummer " + bil.getRegNummer() + " är av typen "
                    + bil.getSort() + " och ägs av "+ bil.getBilägare().getName());
        }
    }


    public static void main(String[] args) {
        Bilägare Valeria = new Bilägare("Valeria ", "Sjöviksvägen 37 ", 37);
        Bilägare Lisa = new Bilägare("Lisa", "Laduvägen 8", 27);
        Bil rödaSaaben = new Bil("XYZ 123", "Saab");
        Bil vitaVolvon = new Bil("ERT 432", "Volvo");
        Bilägare Bosse = new Bilägare("Bosse", "Bilvägen 3", 65);
        Bilägare Kim = new Bilägare("Kim", "Kalasvägen 6", 37);

        //rödaSaaben.ägsAv(Bosse);
        vitaVolvon.ägsAv(Lisa);
        rödaSaaben.såld();
        rödaSaaben.ägsAv(Kim);

        printBil(rödaSaaben);
        printBil(vitaVolvon);
        /*System.out.print(Valeria.getName());
        System.out.print(Valeria.getAdress());
        System.out.print(Valeria.getÅlder());
        System.out.println(Lisa.getName());
        System.out.println(Lisa.getAdress());
        System.out.println(Lisa.getÅlder());*/
    }
}