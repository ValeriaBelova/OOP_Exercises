package SyntaxTrainingJava;


public class SimpleForLoop {
    public static void main(String[] args) {
//vanlig for-loop
        /*for (int i = 10; i >= 0; i = i - 2) {
            System.out.println(i);
        }


//oändlig for-loop, slutar aldrig att skriva ut ordet infinite, sällan använt
        for(int i=1;i>=1;i++) {
            System.out.println("Infinite");
        }


//en till exempel på oändlig for-loop som ger resultat som i loop innan
        for(;;) {
            System.out.println("Infinite");
        }*/


//for-loop och array
        /*String[] arrMonths = {"May","June","July"}; //skapar och initierar en rad strängar i en enda, åtkomst till varje element med for-loop
        System.out.println("Length of array is: " + arrMonths.length); //skriver hur lång är array
        for(int i=0;i<arrMonths.length;i++) { //skriva ut i så länge det finns strängar i array att ta från denna array
            System.out.println(arrMonths[i]);
        }*/

//for-loop och array
        /*int[] numbers = new int[5];
        numbers[0] = 100;
        numbers[1] = 101;
        numbers[2] = 103;
        numbers[3] = 104;
        numbers[4] = 105;

        for(int i: numbers) {
            System.out.println(i);
        }*/


//for-loop och array
        /*String[] lang = {"Java","C","C++","PHP","VBScript","Javascript"};
        for(String names: lang) {
            System.out.println(names);
        }*/


//kapslad for-loop (för komplicerad just nu för mig, förstår inte)
        /*for(int i=1;i<=3;i++) {
            for(int j=1;j<=3;j++) {
                System.out.println("i:" + i + "," + "j:" + j);
            }
        }*/


//kapslad for-loop för att visa mönster * (komplicerad för mig, förstår inte)
        /*for(int i=1;i<=4;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/


//märkt for-loop med pausuttrycket (komplicerad, förstår inte)
        /*loop1: //yttre for-loop
        for(int i=3;i>=0;i--) {
            loop2: //inre for-loop
            for(int j=1;j<=3;j++) {
                System.out.println(i + " " + j);
                if(i==2 && j ==2)
                    break loop1;
            }
        }*/


//märkt for-loop med fortsättningsuttalande (komplicerad)
        /*loop1:
        for(int i=3;i>=0;i--) {
            loop2:
            for(int j=1;j<=3;j++) {

                if(i==2 && j ==2)
                    continue loop1;
                System.out.println(i + " " + j);
            }
        }*/


//for-loop med flera variabler (komplicerad)
        /*for(int i=0,j=1; i<2 && j<3 ; i++,j++) {
            System.out.println("i:" + i + " j:" + j);
        }*/


//for-loop med flera variabler
        /*for(int i=1,j=1; i<=3;i++) {
            System.out.println("i:" + i + " j:" + j);
        }*/


//for-loop där återinitialiseras variabel --- programmet visar fel, får inte göra så
        /*int i=4;
        for(int i=0;i<=10;i=i+2) {
            System.out.println(i);
        }*/
    }
}


