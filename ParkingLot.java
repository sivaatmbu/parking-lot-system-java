package ParkingLotSystem;
import java.util.List;
public class ParkingLot {
    private List<ParkingSlot> parkingSlots;
    public ParkingLot(List<ParkingSlot> parkingSlots){
        this.parkingSlots = parkingSlots;
    }
    public void parkVehicle(Vehicle vehicle){
        for(ParkingSlot parkingSlot:parkingSlots){
            if(parkingSlot.isSlotAvailable()){
                if(parkingSlot.getSupportedVehicleType().equals(vehicle.getVehicleType())){
                    parkingSlot.parkVehicle(vehicle);
                    System.out.println("Vehicle " +vehicle.getVehicleNumber() +" (" +vehicle.getVehicleType() + ")"+" parked successfully in Slot " +parkingSlot.getSlotId());
                    return;
                }
            }
        }
        System.out.println("Parking Full");
    }
    public void removeVehicle(String vehicleNo) {
        for (ParkingSlot parkingSlot : parkingSlots) {
            if (!parkingSlot.isSlotAvailable()) {
                // if slot is empty how can we remove that vehicle from that slot
                if (parkingSlot.getVehicle().getVehicleNumber().equals(vehicleNo)) {
                    parkingSlot.removeVehicle();
                    System.out.println("Vehicle "+vehicleNo+" removed successfully from Slot " +parkingSlot.getSlotId());
                    return;
                }
            }
        }

        System.out.println("Vehicle Not Found");
    }
    public void searchVehicle(String vehicleNumber){
        for(ParkingSlot parkingSlot:parkingSlots){
            if(!parkingSlot.isSlotAvailable()) {
                if (parkingSlot.getVehicle().getVehicleNumber().equals(vehicleNumber)) {
                    System.out.println("Vehicle "+vehicleNumber +" found in Slot " + parkingSlot.getSlotId());
                    return;
                }
            }
        }
        System.out.println("Vehicle Not Found");
    }
    public void displayAvailableSlots() {
        System.out.println("Available slots : ");
        for(ParkingSlot parkingSlot:parkingSlots){
            if(parkingSlot.isSlotAvailable()){
                System.out.println("Slot " +parkingSlot.getSlotId()+" -> Supports "+parkingSlot.getSupportedVehicleType());
            }
        }
    }
    public void displayOccupiedSlots() {
        System.out.println("Occupied slots : ");
        for(ParkingSlot parkingSlot:parkingSlots){
            if(! parkingSlot.isSlotAvailable()){
                System.out.println("Slot "+parkingSlot.getSlotId() +" -> " +parkingSlot.getVehicle().getVehicleType() +" (" +parkingSlot.getVehicle().getVehicleNumber() + ")");
            }
        }
    }

}