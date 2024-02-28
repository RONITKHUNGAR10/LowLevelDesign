package RideSharingLowLevel.Services;

import RideSharingLowLevel.Entities.Ride;
import RideSharingLowLevel.Entities.Rider;

public interface RideService {

     Ride assignRide(Rider ride,int startKm,int endKm) throws Exception;

     Ride cancelRide(Ride ride);

     Ride endRide(Ride ride);

}
