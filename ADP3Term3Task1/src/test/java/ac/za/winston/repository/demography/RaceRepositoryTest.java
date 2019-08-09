package ac.za.winston.repository.demography;

import ac.za.winston.domain.demography.Race;
import ac.za.winston.factory.demography.RaceFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceRepositoryTest {

    RaceRepository repository;
    Race race;

    @Before
    public void setUp() throws Exception {
        repository = RaceRepository.getRepository();
        race = RaceFactory.buildRace("TestEmpNo"
                , "TestRace");
    }

    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println(repository);
    }

    @Test
    public void getAll() {
        repository.create(race); //created again because it get Deleted
        assertNotNull(repository.getAll());
        System.out.println(repository.getAll());
    }

    @Test
    public void create() {
        repository.create(race);
        assertNotNull(repository.read(race.getEmpNo()));
        System.out.println("Created\n" + repository.read("TestEmpNo"));
    }

    @Test
    public void read() {

        assertNotNull(repository.read(race.getEmpNo()));
        System.out.println("Read\n" + repository.read("TestEmpNo")); //id delete Test is enabled this test will come back as Error
    }
    @Test
    public void update() {

        Race raceUpdate =RaceFactory.buildRace("TestEmpNo"
                , "Updated");
        repository.update(raceUpdate);
        System.out.println(repository.read("TestEmpNo"));
    }

    @Test
    public void delete() {
        repository.delete(race.getEmpNo());
        assertNull(repository.read("TestEmpNo"));
        System.out.println("Deleted\n" + repository.read("TestEmpNo"));
    }
}
