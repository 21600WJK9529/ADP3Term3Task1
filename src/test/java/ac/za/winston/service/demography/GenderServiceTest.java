package ac.za.winston.service.demography;

import ac.za.winston.domain.demography.Gender;
import ac.za.winston.factory.demography.GenderFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderServiceTest {

    GenderService service;
    Gender gender;

    @Before
    public void setUp() throws Exception {
        service = GenderService.getService();
        gender = GenderFactory.buildGender("TestEmpNo"
                , "TestGender");
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
        service.create(gender);
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
        service.create(gender); //Because value gets deleted
        System.out.println(service.read("TestEmpNo"));

        Gender genderUpdated = GenderFactory.buildGender("TestEmpNo", "Updated");
        service.update(genderUpdated);
        Gender g = service.read("TestEmpNo");
        assertNotEquals(gender.getGender(), g.getGender());
        System.out.println("Updated\n"+service.read("TestEmpNo"));
    }

    @Test
    public void delete() {
        service.delete("TestEmpNo");
        assertNull(service.read(gender.getEmpNo()));
        System.out.println("Delete\n"+service.read(gender.getEmpNo()));
    }
}

