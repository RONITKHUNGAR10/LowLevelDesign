package RideSharingLowLevel.Services;

public interface PricingStrategy {

  Integer AMT_PER_KM = 20;

  double calculateFare(int origin, int destination, int seats);

}
