package by.academy.airLine;

public class RegionalPassengerAircraft extends Aircraft {
    private final Integer seatingCapacity;

    public RegionalPassengerAircraft(String manufacturer,String model,int flightRange,int fuelConsumption,Integer seatingCapacity) {
        super(manufacturer,model,flightRange,fuelConsumption);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public int getCargoCapacity() {
        return 0;
    }
}
