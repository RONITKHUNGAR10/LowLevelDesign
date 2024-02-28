package RideSharingLowLevel.Entities;

import lombok.Getter;

@Getter
public class Rider {
    private int riderId;
    private String riderName;
    private int totalNumberOfRides;
    boolean preferredRider;

    Rider(int riderId,String riderName){
        this.riderId=riderId;
        this.riderName=riderName;
    }


    public void incrementTotalNumberOfRides(){
        this.totalNumberOfRides++;
        if(totalNumberOfRides>10)
            preferredRider=true;
    }
}
