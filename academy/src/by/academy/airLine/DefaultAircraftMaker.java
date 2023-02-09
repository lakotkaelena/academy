package by.academy.airLine;

import java.util.ArrayList;
import java.util.List;

public class DefaultAircraftMaker implements AircraftMaker {

    @Override
    public List<Aircraft> make() {
        ArrayList<Aircraft> aircrafts = new ArrayList<>();
        aircrafts.add(new InternationalPassengerAircraft("Embraer", "175", 3334, 300, 0, 76, 870));
        aircrafts.add(new InternationalPassengerAircraft("Boeing", "737-300", 4400, 400, 0, 148, 910));
        aircrafts.add(new InternationalPassengerAircraft("Boeing", "737-8", 6574, 450, 0, 174, 842));
        aircrafts.add(new RegionalPassengerAircraft("Туполев", "Ту-134", 2800, 150, 80));
        aircrafts.add(new RegionalPassengerAircraft("Туполев", "Ту-154", 3000, 200, 160));
        aircrafts.add(new CargoAircraft("Airbus", "A400M", 3300, 350, 37000));
        aircrafts.add(new CargoAircraft("Adam", "A500", 2130, 120, 750));
        return aircrafts;
    }

}

