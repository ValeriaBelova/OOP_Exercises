package Sprint1.Ovningar.Ovning1;

public class Person {

    String namn;
    String adress;
    int ålder;

    public Person (){}


    public Person (String namn, String adress, int ålder){
        this.namn = namn;
        this.adress = adress;
        this.ålder = ålder;
    }

    public String getName() {
        return namn;
    }

    public String getAdress() {
        return adress;
    }

    public int getÅlder() {
        return ålder;
    }
}
