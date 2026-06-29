import java.util.*;

public class EventManager {

    HashSet<String> participants = new HashSet<>();

    public void register(String email) {

        if (participants.add(email))
            System.out.println("Registration Successful.");
        else
            System.out.println("Duplicate Registration!");
    }

    public void displayParticipants() {

        System.out.println("Participants:");

        for (String p : participants)
            System.out.println(p);

        System.out.println("Total Participants = " + participants.size());
    }
}