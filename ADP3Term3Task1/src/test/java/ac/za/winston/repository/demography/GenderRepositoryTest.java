package ac.za.winston.repository.demography;

import ac.za.winston.domain.demography.Gender;
import ac.za.winston.factory.demography.GenderFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderRepositoryTest {

    GenderRepository repository;
    Gender gender;

    @Before
    public void setUp() throws Exception {
        repository = GenderRepository.getRepository();
        gender = GenderFactory.buildGender("TestEmpNo"
                , "TestGender");
    }

    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println(repository);
    }

    @Test
    public void getAll() {
        repository.create(gender); //created again because it get Deleted
        assertNotNull(repository.getAll());
        System.out.println(repository.getAll());
    }

    @Test
    public void create() {
        repository.create(gender);
        assertNotNull(repository.read(gender.getEmpNo()));
        System.out.println("Created\n" + repository.read("TestEmpNo"));
    }

    @Test
    public void read() {

        assertNotNull(repository.read(gender.getEmpNo()));
        System.out.println("Read\n" + repository.read("TestEmpNo")); //id delete Test is enabled this test will come back as Error
    }
    @Test
    public void update() {

        Gender genderUpdate = GenderFactory.buildGender("TestEmpNo"
                , "Updated");
        repository.update(genderUpdate);
        System.out.println(repository.read("TestEmpNo"));
    }

    @Test
    public void delete() {
        repository.delete(gender.getEmpNo());
        assertNull(repository.read("TestEmpNo"));
        System.out.println("Deleted\n" + repository.read("TestEmpNo"));
    }
}
