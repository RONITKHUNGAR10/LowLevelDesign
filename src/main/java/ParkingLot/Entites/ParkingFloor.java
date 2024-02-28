package ParkingLot.Entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ParkingFloor {
  int floorNumber;
  List<LargeParkingSpot> largeParkingSpots;
  List<SmallParkingSpot> smallParkingSpots;
  List<ElectricParkingSpot> electricParkingSpots;
  boolean isFull;
}
