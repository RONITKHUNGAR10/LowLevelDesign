package ParkingLot.Entites;

import ParkingLot.Enums.ParkingSpotType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class ParkingSpot {
    int parkingSpotId;
    boolean isOccupied;
    Vehicle vehicle;
    ParkingSpotType parkingSpotType;

     ParkingSpot(ParkingSpotType parkingSpotType){
        this.parkingSpotType =parkingSpotType;
    }

}
