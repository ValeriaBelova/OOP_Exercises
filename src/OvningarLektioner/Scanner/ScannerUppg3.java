package OvningarLektioner.Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerUppg3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String input = scan.nextLine();
            if (input.equals("bye")) {
                System.exit(0);
            }
            System.out.println(input.charAt(input.length() - 1));

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Vad tänker du på?");
        String tanke = scan.nextLine();
        System.out.println("Du har skrivit " + tanke);

        while (scan.hasNextLine()){
            String input = scan.nextLine();
            if (input.equals("bye")){
                System.exit(0);
            }
            System.out.println("You said: "+input);
            System.out.print("Write something: ");*/


        }
    }


}
