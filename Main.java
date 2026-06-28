package ParkingLotSystem;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args){
        // Create Parking Slots
        ParkingSlot slot1 =new ParkingSlot(1,"Bike");
        ParkingSlot slot2 =new ParkingSlot(2,"Bike");
        ParkingSlot slot3 =new ParkingSlot(3,"Car");
        ParkingSlot slot4 =new ParkingSlot(4,"Car");
        ParkingSlot slot5 =new ParkingSlot(5,"Truck");
        // Store all slots in a list
        List<ParkingSlot> parkingSlots =new ArrayList<>();
        parkingSlots.add(slot1);
        parkingSlots.add(slot2);
        parkingSlots.add(slot3);
        parkingSlots.add(slot4);
        parkingSlots.add(slot5);
        // Create Parking Lot
        ParkingLot parkingLot = new ParkingLot(parkingSlots);
        // Create Vehicles
        Vehicle bike = new Vehicle("Bike","AP39BK1234");
        Vehicle car = new Vehicle("Car","AP39CR5678");
        Vehicle truck = new Vehicle("Truck","AP39TR9999");
        // Park Vehicles
        parkingLot.parkVehicle(bike);
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        // Display Available Slots
        System.out.println("\n----- Available Slots -----");
        parkingLot.displayAvailableSlots();
        // Search Vehicle
        System.out.println("\n----- Search Vehicle -----");
        parkingLot.searchVehicle("AP39CR5678");
        // Remove Vehicle
        System.out.println("\n----- Remove Vehicle -----");
        parkingLot.removeVehicle("AP39CR5678");
        // Display Occupied Slots
        System.out.println("\n----- Occupied Slots -----");
        parkingLot.displayOccupiedSlots();
        // Display Available Slots Again
        System.out.println("\n----- Available Slots After Removing Car -----");
        parkingLot.displayAvailableSlots();
    }
}