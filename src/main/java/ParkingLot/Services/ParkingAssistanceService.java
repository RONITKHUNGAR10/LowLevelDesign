package ParkingLot.Services;

import ParkingLot.Entites.ParkingSpot;
import ParkingLot.Entites.Vehicle;

public interface ParkingAssistanceService {
    ParkingSpot getAvailableParkingSpot(Vehicle vehicle);

    boolean assignParkingSpot(Vehicle vehicle, ParkingSpot parkingSpot);

    void exitParkingSpot(Vehicle vehicle, ParkingSpot parkingSpot);

}
