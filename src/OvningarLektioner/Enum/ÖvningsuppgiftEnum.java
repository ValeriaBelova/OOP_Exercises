package OvningarLektioner.Enum;

public class ÖvningsuppgiftEnum {

    public static void main(String[] args){
        for (RomerskaSiffror r : RomerskaSiffror.values()){
            System.out.println(r + " is "
                    + r.getDigit() +" "+r.getString());
        }

        //RomerskaSiffror r2 = RomerskaSiffror.L.M.D;

        //Month m = Month.MARCH;
    }
}