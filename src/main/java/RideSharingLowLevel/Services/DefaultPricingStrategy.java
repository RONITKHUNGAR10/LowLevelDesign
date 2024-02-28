package RideSharingLowLevel.Services;

public class DefaultPricingStrategy implements PricingStrategy {

  @Override
  public double calculateFare(final int origin, final int destination, final int seats) {
    return AMT_PER_KM * (destination - origin) * seats * (seats > 1 ? 0.75 : 1);
  }

}
