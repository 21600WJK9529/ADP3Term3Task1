package ac.za.winston.domain.demography;

import ac.za.winston.factory.demography.RaceFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceTest {

    private ac.za.winston.repository.demography.RaceRepository RaceRepository;
    private Race race;
    @Before
    public void setUp() throws Exception {
        RaceRepository = RaceRepository.getRepository();

        race = RaceFactory.buildRace("TestEmpNo", "TestRace");
    }

    @Test
    public void getEmpNo() {
        assertNotNull(race.getEmpNo());
        System.out.println(race.getEmpNo());
    }

    @Test
    public void getRace() {
        assertNotNull(race.getRace());
        System.out.println(race.getRace());
    }
}
