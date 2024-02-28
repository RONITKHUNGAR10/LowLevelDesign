package RideSharingLowLevel.Services;

public class PrefferredPricingStrategy implements PricingStrategy{
    @Override
    public double calculateFare(
            final int origin, final int destination, final int seats) {
        return AMT_PER_KM * (destination - origin) * seats * (seats > 1 ? 0.5 : 0.75);
    }
}
