package by.academy.airLine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AirLine {
    private String name;
    AircraftMaker aircraftMaker = new DefaultAircraftMaker();
    List<Aircraft> list = aircraftMaker.make();

    public AirLine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void calculateTotalCargoCapacity() {
        int totalCargoCapacity = 0;
        for (int i = 0; i <list.size(); i++) {
            totalCargoCapacity +=list.get(i).getCargoCapacity();
        }
        System.out.println("Общая грузоподъемность: " + totalCargoCapacity);
    }

    public void calculatePassengerCapacity() {
        int totalPassengerCapacity = 0;
        for (int i = 0; i <list.size(); i++) {
            totalPassengerCapacity +=list.get(i).getSeatingCapacity();
        }
        System.out.println("Общее количество посадочных мест: " + totalPassengerCapacity);
    }

    public void sortAircraftByFlightRange() {
        AircraftComparator aircraftComparator = new AircraftComparator();
        Collections.sort(this.list, aircraftComparator);
        System.out.println();
    }

    public ArrayList<Aircraft> filterAircraftByFuelConsumption(int min, int max) {
        ArrayList<Aircraft> filterList = new ArrayList<>();
        for (int i = 0; i <list.size(); i++) {
            int aircraftFuelConsumption =list.get(i).getFuelConsumption();
            if (aircraftFuelConsumption >= min && aircraftFuelConsumption <= max) {
                filterList.add(list.get(i));
            }
        }
        return filterList;
    }

    public void showAircraftsAirline() {
        printAircraftList(this.list);
    }

    public void printAircraftList(List<Aircraft> aircraftList) {
        System.out.println(this.getName() + "-------------------");
        for (int i = 0; i < aircraftList.size(); i++) {
            System.out.println(aircraftList.get(i));
        }
    }
}
