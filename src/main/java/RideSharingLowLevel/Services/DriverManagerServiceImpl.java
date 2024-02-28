package RideSharingLowLevel.Services;

import RideSharingLowLevel.Entities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DriverManagerServiceImpl implements DriverManagerService{
    List<Driver> driverList = new ArrayList<>();
    Driver newDriver;
    @Override
    public Driver createDriver(int driverId, String driverName) throws Exception {
        boolean driverExists = driverList.stream().anyMatch(driver -> driver.getDriverId() == driverId);
        if(driverExists)
            throw new Exception("Driver already exists");
        else{
            newDriver = new Driver(driverId,driverName);
            driverList.add(newDriver);
        }
        return newDriver;
    }

    @Override
    public List<Driver> getAvailableDrivers() {
        return driverList.stream().filter(driver -> driver.isDriverAvailable()).collect(Collectors.toList());
    }

    @Override
    public void updateDriverAvailability(Driver driver, boolean availability) {
       driver.setDriverAvailable(availability);
    }
}
