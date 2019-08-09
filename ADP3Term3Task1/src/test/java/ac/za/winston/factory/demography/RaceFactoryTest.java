package ac.za.winston.factory.demography;

import ac.za.winston.domain.demography.Race;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    Race race;
    @Before
    public void setUp() throws Exception {
        race  = RaceFactory.buildRace("TestEmpNo", "TestRace");
    }

    @Test
    public void buildRace() {
        assertNotNull(race);
        System.out.println(race);
    }
}
