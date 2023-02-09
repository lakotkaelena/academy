package by.academy.airLine;

public class Main {
    public static void main(String[] args) {
        AircraftMaker maker = new DefaultAircraftMaker();
        AirLine airLine = new AirLine("Международные авиалинии");
        airLine.printAircraftList(maker.make());
        System.out.println();
        System.out.println("Самолеты по дальности полета: ");
        airLine.sortAircraftByFlightRange();
        airLine.showAircraftsAirline();
        airLine.calculatePassengerCapacity();
        airLine.calculateTotalCargoCapacity();
        System.out.println();
        airLine.filterAircraftByFuelConsumption(100,300);
    }
}
