package by.academy.airLine;

public abstract class Aircraft {
    private final String manufacturer;   //фирма-производитель
    private final String model;          //модель самолета
    private final Integer flightRange;      //дальность полета
    private final Integer fuelConsumption;    //расход топлива


    public Aircraft(String manufacturer, String model, int flightRange, int fuelConsumption) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() {
        return model;
    }

    public Integer getFlightRange() {
        return flightRange;
    }

    public Integer getFuelConsumption() {
        return fuelConsumption;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", flightRange=" + flightRange +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

    public abstract int getSeatingCapacity();
    public abstract int getCargoCapacity();

}
