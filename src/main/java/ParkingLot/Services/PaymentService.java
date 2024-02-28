package ParkingLot.Services;

import ParkingLot.Entites.ParkingTicket;

public interface PaymentService {

    int getTotalPrice(ParkingTicket parkingTicket);

    boolean pay(ParkingTicket parkingTicket,String paymentMode);
}
