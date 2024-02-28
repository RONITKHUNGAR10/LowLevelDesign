package RideSharingLowLevel.Services;

import RideSharingLowLevel.Entities.Driver;

import java.util.List;

public interface DriverManagerService {

    Driver createDriver(int driverId,String driverName) throws Exception;

    List<Driver> getAvailableDrivers();

    void updateDriverAvailability(Driver driver,boolean availability);

}
