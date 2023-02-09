package by.academy.airLine;

import by.academy.airLine.Aircraft;

public class CargoAircraft extends Aircraft {
    private final Integer cargoCapacity;    //грузоподъемность

    public CargoAircraft(String manufacturer,String model, int flightRange, int fuelConsumption,Integer cargoCapacity) {
        super(manufacturer,model,flightRange,fuelConsumption);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public int getSeatingCapacity() {
        return 0;
    }

    @Override
    public int getCargoCapacity() {
        return cargoCapacity;
    }
}
