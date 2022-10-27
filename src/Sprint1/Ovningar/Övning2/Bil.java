package Sprint1.Ovningar.Övning2;

public class Bil extends Fordon{
    private int motoreffekt; //bäst att skriva private innan variabel
    int antalHjul = 4; //lärare adderar denna variabel med värde 4
    //int antalVäxlar;
    //int växelJustNu;

    public Bil(int hastighet, int vikt, int motoreffekt) { //lägger till motoreffekt variabel
        super(hastighet, vikt);
        this.motoreffekt = motoreffekt; // motoreffekt variabel finns bara i Bil klass hittills och måste skriva this.motoreffekt att ta data från den
    }

    public void växla() {} //ny metod i Bil klass som är tom hittills

    public void printMe() { // ny metod som bara skriver ut! jättesmidigt!
        System.out.println("Bil med hastighet " + getHastighet() + "km/h, vikt " + getVikt() + "kg och motoreffekt: " + motoreffekt);
    }

    public int getAntalHjul() { //via Generate, väljer från listan den metoden som inte har använts än. Ta fram värde via metoden
        return antalHjul;
    }
}
