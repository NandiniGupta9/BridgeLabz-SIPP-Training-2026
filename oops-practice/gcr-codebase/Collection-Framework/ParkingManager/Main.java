public class Main {

    public static void main(String[] args) {

        ParkingManager pm = new ParkingManager();

        pm.enterVehicle("DL01AB1234");
        pm.enterVehicle("UP32XY5678");

        pm.searchVehicle("DL01AB1234");

        pm.displayVehicles();

        pm.exitVehicle("DL01AB1234");

        pm.displayVehicles();
    }
}