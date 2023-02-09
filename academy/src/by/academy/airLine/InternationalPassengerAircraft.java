package by.academy.airLine;

public class InternationalPassengerAircraft extends Aircraft {
    private final Integer cargoCapacity;
    private final Integer seatingCapacity;
    private final Integer cruisingSpeed;


    public InternationalPassengerAircraft(String manufacturer, String model, int flightRange,
                             int fuelConsumption, Integer cargoCapacity, Integer seatingCapacity, Integer cruisingSpeed) {
        super(manufacturer, model, flightRange, fuelConsumption);
        this.cargoCapacity = cargoCapacity;
        this.seatingCapacity = seatingCapacity;
        this.cruisingSpeed = cruisingSpeed;
    }

    @Override
    public int getCargoCapacity() {
        return 0;
    }

    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public Integer getCruisingSpeed() {
        return cruisingSpeed;
    }
}
