package Sprint2.Inlämningsuppgift2Gym;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;

public class CurrentlyPayingCustomer extends Member {
    ArrayList<Member> allCurrentlyPayingCustomers = new ArrayList<>();

    public CurrentlyPayingCustomer(String idNumber, String name, LocalDate paymentDate) {
        super(idNumber, name, paymentDate);
    }

    public void createListWithAllPayingCustomers(ArrayList<Member> members) {
        LocalDate date = LocalDate.now();
        for (Member member : members) {
            if (!member.getName().equals("not a member") && !member.getIdNumber().equals("123") && member.getPaymentDate().isAfter(date.minusYears(1))) {
            allCurrentlyPayingCustomers.add(member);
        }
    }
    }

    public void createWorkoutInfo(ArrayList<Member> payingCustomers) {
        LocalDate ld = LocalDate.now();
        String workoutInfo = "";
        for (Member member : payingCustomers) {
            workoutInfo = workoutInfo + member.getName() + " " + member.getIdNumber() + " " + ld + "\n";
        }
        registerWorkoutForPayingCustomer(workoutInfo);
    }

    public void registerWorkoutForPayingCustomer (String workoutInfo) {
        File log = new File ("src/Sprint2/Inlämningsuppgift2Gym/PayingCustomers.txt");
        LocalDate ld = LocalDate.now();
        try(FileWriter fileWriter = new FileWriter(log, true);) {
            if(!log.exists()) {
                log.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(workoutInfo);
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}



