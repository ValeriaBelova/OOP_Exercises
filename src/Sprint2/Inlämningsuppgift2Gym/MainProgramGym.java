package Sprint2.Inlämningsuppgift2Gym;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class MainProgramGym {

    public static void main(String[] args) {

        while (true) {
            String input = JOptionPane.showInputDialog("Skriv in kunds namn eller personnummer: ");
            if (input == null) {
                break;
            }
            //anropar listan med medlemmar oavsett betalnings dag
            ArrayList<String> members = Member.sortMembersInFile();
            //anropar listan med medlemmar som betalade senaste år
            ArrayList<Member> gymMembers = Member.initializingMembersInArrayList(members);

            Member member = Member.findMember(input, gymMembers);
            member.createWorkoutInfo(member);

            String infoForReception = member.checkMembershipStatus(member);
            JOptionPane.showMessageDialog(null, infoForReception);
        }
    }
}
