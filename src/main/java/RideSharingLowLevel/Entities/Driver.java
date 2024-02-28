package RideSharingLowLevel.Entities;

import RideSharingLowLevel.Services.DriverManagerService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public class Driver  {
    int driverId;
    String driverName;
    boolean isDriverAvailable;

    public Driver(int driverId,String driverName){
        this.driverId=driverId;
        this.driverName=driverName;
        this.isDriverAvailable=true;
    }

    public void setDriverAvailable(boolean isDriverAvailable){
        this.isDriverAvailable=isDriverAvailable;
    }

}
