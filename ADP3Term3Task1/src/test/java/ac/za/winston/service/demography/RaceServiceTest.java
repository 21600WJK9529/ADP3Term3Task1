package ac.za.winston.service.demography;

import ac.za.winston.domain.demography.Race;
import ac.za.winston.factory.demography.RaceFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceServiceTest {

    RaceService service;
    Race race;

    @Before
    public void setUp() throws Exception {
        service = RaceService.getService();
        race = RaceFactory.buildRace("TestEmpNo"
                , "TestRace");
    }

    @Test
    public void getService() {
        assertNotNull(service);
        System.out.println(service);
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        service.create(race);
        assertNotNull(service.read("TestEmpNo"));
        System.out.println("Created\n" + service.read("TestEmpNo"));
    }

    @Test
    public void read() {
        assertNotNull(service.read("TestEmpNo"));
        System.out.println("Read\n"+ service.read("TestEmpNo"));
    }

    @Test
    public void update() {
        service.create(race);
        System.out.println(service.read("TestEmpNo"));

        Race genderUpdated = RaceFactory.buildRace("TestEmpNo", "Updated");
        service.update(genderUpdated);
        Race g = service.read("TestEmpNo");
        assertNotEquals(race.getRace(), g.getRace());
        System.out.println("Update\n"+service.read("TestEmpNo"));
    }

    @Test
    public void delete() {
        service.delete("TestEmpNo");
        assertNull(service.read(race.getEmpNo()));
        System.out.println("Delete\n"+service.read(race.getEmpNo()));
    }
}