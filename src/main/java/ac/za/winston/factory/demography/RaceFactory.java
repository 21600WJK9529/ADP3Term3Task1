package ac.za.winston.factory.demography;

import ac.za.winston.domain.demography.Race;

public class RaceFactory {

    public static Race buildRace(String empNo, String race){
        return new Race.Builder()
                .empNo(empNo)
                .race(race)
                .Build();
    }
}
