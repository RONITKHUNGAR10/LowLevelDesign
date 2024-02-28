package ParkingLot.Services;

import ParkingLot.Entites.ParkingFloor;
import ParkingLot.Entites.ParkingSpot;

public interface ParkingLotService {
    void addFloor(ParkingFloor parkingFloor);

    void addParkingSpotToFloor(ParkingSpot parkingSpot, ParkingFloor parkingFloor);
}
