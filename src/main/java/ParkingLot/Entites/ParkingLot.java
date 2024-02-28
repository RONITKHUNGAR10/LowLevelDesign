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
public class ParkingLot {
    int parkingLotId;
    String address;
    List<ParkingFloor> parkingFloors;
    boolean isFull;
}
