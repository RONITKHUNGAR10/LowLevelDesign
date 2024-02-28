package ParkingLot.Entites;

import ParkingLot.Enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Vehicle {
    int vehicleNo;
    VehicleType vehicleType;
    ParkingTicket parkingTicket;

    public Vehicle(VehicleType vehicleType){
        this.vehicleType = vehicleType;
    }
}
