package RideSharingLowLevel.Services;

import RideSharingLowLevel.Entities.Driver;
import RideSharingLowLevel.Entities.Ride;
import RideSharingLowLevel.Entities.Rider;
import RideSharingLowLevel.Enums.TripStatus;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class RideServiceImpl implements RideService{


    private DriverManagerServiceImpl driverManager;

    int totalRides = 1;

    @Override
    public Ride assignRide(Rider rider, int startKm, int endKm) throws Exception {
        Ride ride = null;
        if(startKm>endKm)
            throw new Exception("Start km cannot be grater than end km");
        if(driverManager!=null){
            List<Driver> availableDrivers = driverManager.getAvailableDrivers();
            if(availableDrivers.isEmpty())
                throw new Exception("No available drivers right now");
            Driver driver = availableDrivers.stream().findAny().get();
             ride = Ride.builder()
                    .build();
            //update driver availability
            driver.setDriverAvailable(false);
        }
        return ride;
    }

    @Override
    public Ride cancelRide(Ride ride) {
        List<Driver> availableDrivers = driverManager.getAvailableDrivers();
        Driver driver = availableDrivers.stream().filter(driver1 -> driver1.getDriverId()==ride.getDriver().getDriverId()).findAny().get();
        driver.setDriverAvailable(true);
        ride.setTripStatus(TripStatus.CANCELLED);
        return ride;
    }

    @Override
    public Ride endRide(Ride ride) {
        //initiate payment
        PricingStrategy pricingStrategy = ride.getRider().getTotalNumberOfRides() > 10 ? new PrefferredPricingStrategy() : new DefaultPricingStrategy();
        ride.setFare(pricingStrategy.calculateFare(ride.getStartLocation(),ride.getEndLocation(),ride.getNoOfSeats()));
        List<Driver> availableDrivers = driverManager.getAvailableDrivers();
        Driver driver = availableDrivers.stream().filter(driver1 -> driver1.getDriverId()==ride.getDriver().getDriverId()).findAny().get();
        driver.setDriverAvailable(true);
        ride.getRider().incrementTotalNumberOfRides();
        ride.setTripStatus(TripStatus.COMPLETED);
        return ride;
    }
}
