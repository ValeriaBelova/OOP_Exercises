package Sprint2.Inlämningsuppgift2Gym;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;

public class Member {
    //deklarerar variabler (instansvariabler)
    private String idNumber;
    private String name;
    private LocalDate paymentDate;

    /*man skapar konstruktor för att kunna påverka initieringsvärdena,
    konstruktor är en initieringsmetod som anropas automatiskt varje gång
    man skapar ett objekt av den aktuella klassen*/
    //här gör jag en ny variant av klassen Member
    public Member(String idNumber, String name, LocalDate paymentDate) {
        this.idNumber = idNumber;
        this.name = name; //returnera denna aktuella värde (används this)
        this.paymentDate = paymentDate;
    }

    public String getIdNumber() { //metod att returnera idNumber
        return idNumber;
    }
    public String getName() { //metod att returnera namn
        return name;
    }
    public LocalDate getPaymentDate() { //metod att returnera betalnings dag
        return paymentDate;
    }

    //metod för arraylist hantering
    public static ArrayList<String> sortMembersInFile() {
        Path p = Paths.get("src/Sprint2/Inlämningsuppgift2Gym/Customers.txt");
        ArrayList<String> members = new ArrayList<>(); //skapar en ny array
        String tempLine;
    /*läser text från char-input stream, buffer chars att kunna läsa
     chars/array/lines effektivt från file*/
        try (BufferedReader reader = Files.newBufferedReader(p)) {
            while ((tempLine = reader.readLine()) != null) {
                /*medans finns att läsa, då läsa members en efter en och addera till listan*/
                tempLine = tempLine + ", " + reader.readLine();
                members.add(tempLine);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return members;
    }

    //skapar metod för skapa lista med bara members
    public static ArrayList<Member> initializingMembersInArrayList(ArrayList<String> oldArrayList) {
        ArrayList<Member> gymMembers = new ArrayList<>();
        for (String member : oldArrayList) {
            String[] gymMemberNow = member.split(", ", 3);
            gymMembers.add(new Member(gymMemberNow[0], gymMemberNow[1], LocalDate.parse(gymMemberNow[2])));
        }
        return gymMembers;
    }

    public static Member findMember(String input, ArrayList <Member> list){
        for (Member member : list) {
            if (input.equals(member.getIdNumber()) || input.equalsIgnoreCase(member.getName())) {
                    return member;
            }

        }
            return new Member("123","not a member", LocalDate.now().minusYears(2));

    }

    public String checkMembershipStatus(Member member){
        LocalDate date = LocalDate.now();
        if (member.getName().equals("not a member") && member.getIdNumber().equals("123")) {
            return "Personen är inte och har inte varit kund på ''Best Gym Ever''";
        } else if (member.getPaymentDate().isAfter(date.minusYears(1))) {
            return member.getName() + " är en nuvarande kund på ''Best Gym Ever''";
        } else if (member.getPaymentDate().isBefore(date.minusYears(1))) {
            return member.getName() + " är före detta kund\nÅrsavgiften betalades senast " + member.getPaymentDate();
        }
        return "";
    }

    public void createWorkoutInfo(Member member) {
        String workoutInfo;
        LocalDate ld = LocalDate.now();
        if (checkMembershipStatus(member).equals(member.getName() + " är en nuvarande kund på ''Best Gym Ever''")) {
            workoutInfo = member.getName() + " " + member.getIdNumber() + " " + ld + "\n";
            registerWorkoutForOccasionTrainingCustomer(workoutInfo);
        }
    }

    public void registerWorkoutForOccasionTrainingCustomer (String workoutInfo) {
        File file = new File ("src/Sprint2/Inlämningsuppgift2Gym/PayingCustomers.txt");
        try (FileWriter fileWriter = new FileWriter(file, true);) {
            if(!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(workoutInfo);
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}