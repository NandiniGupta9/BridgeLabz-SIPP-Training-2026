import java.util.*;

public class ParkingManager {

    ArrayList<String> vehicles = new ArrayList<>();

    public void enterVehicle(String number) {
        vehicles.add(number);
        System.out.println(number + " Entered.");
    }

    public void exitVehicle(String number) {
        if (vehicles.remove(number))
            System.out.println(number + " Exited.");
        else
            System.out.println("Vehicle not found.");
    }

    public void searchVehicle(String number) {

        if (vehicles.contains(number))
            System.out.println("Vehicle is parked.");
        else
            System.out.println("Vehicle not found.");
    }

    public void displayVehicles() {

        System.out.println("Parked Vehicles:");

        for (String v : vehicles)
            System.out.println(v);

        System.out.println("Occupied Slots = " + vehicles.size());
    }
}