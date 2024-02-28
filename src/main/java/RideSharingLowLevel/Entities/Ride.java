package RideSharingLowLevel.Entities;

import RideSharingLowLevel.Enums.TripStatus;
import RideSharingLowLevel.Services.DriverManagerService;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Builder
public class Ride {
    int rideId;
    DriverManagerService driverManager;
    Rider rider;
    int startLocation;
    int endLocation;
    int noOfSeats;
    @Setter
    TripStatus tripStatus;
    @Setter double fare;
    Driver driver;

//    Ride(int rideId, DriverManagerService driverManager, int startLocation, int endLocation, Rider rider, Driver driver, int noOfSeats) {
//        this.rideId = rideId;
//        this.driverManager = driverManager;
//        this.startLocation = startLocation;
//        this.endLocation = endLocation;
//        this.rider = rider;
//        this.tripStatus = TripStatus.NEW;
//        this.driver = driver;
//        this.noOfSeats = noOfSeats;
//    }


}
