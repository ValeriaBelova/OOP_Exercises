package OvningarLektioner.TempIMånadÖvning;

import java.io.BufferedReader;
import java.io.FileReader;

public class TempKodÖvning {
    public static void main(String[] args){
        String tempLine;
        double highestTemp;
        double lowestTemp;
        double medelTemp;

//src/OvningarLektioner/TempIMånadÖvning/TempKodÖvning.java
        try(BufferedReader bufIn = new BufferedReader(new
                FileReader("src/OvningarLektioner/TempIMånadÖvning/TemperatureInMonth.txt")))
        {
            while((tempLine = bufIn.readLine()) != null){
                System.out.println(tempLine);
            }
        }
        catch (Exception e){
            System.out.println("error happened");
        }
    }



}
