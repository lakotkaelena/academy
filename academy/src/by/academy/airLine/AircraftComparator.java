package by.academy.airLine;

import java.util.Comparator;

public class AircraftComparator implements Comparator<Aircraft> {


    @Override
    public int compare(Aircraft o1,Aircraft o2) {
        int i = o1.getFlightRange().compareTo(o2.getFlightRange());
        return i;
            }

}
