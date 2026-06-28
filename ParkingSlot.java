package ParkingLotSystem;
public class ParkingSlot {
    private int slotId;
    private String supportedVehicleType;
    private Vehicle vehicle;
    public ParkingSlot(int slotId, String supportedVehicleType) {
        this.slotId = slotId;
        this.supportedVehicleType = supportedVehicleType;
        //examples:
        //ParkingSlot p1=new ParkingSlot(129,"Car") -->this means here you can park car only
        //ParkingSlot p2=new ParkingSlot(131,"Bike") -->in this slot you can park bike only
    }
    public int getSlotId() {
        return slotId;
    }
    public String getSupportedVehicleType() {
        return supportedVehicleType;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public boolean isSlotAvailable() {
        return vehicle == null;     // if slot is Available there should be no vehicle in that slot so vehicle =null;
    }
    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void removeVehicle() {
        this.vehicle = null;
    }
}