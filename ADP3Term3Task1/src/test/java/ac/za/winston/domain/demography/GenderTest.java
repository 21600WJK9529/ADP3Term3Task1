package ac.za.winston.domain.demography;

import ac.za.winston.factory.demography.GenderFactory;
import ac.za.winston.repository.demography.GenderRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderTest {

    private GenderRepository genderRepository;
    private Gender gender;
    @Before
    public void setUp() throws Exception {
        genderRepository = GenderRepository.getRepository();

        gender = GenderFactory.buildGender("TestEmpNo", "TestGender");
    }

    @Test
    public void getEmpNo() {
        assertNotNull(gender.getEmpNo());
        System.out.println(gender.getEmpNo());
    }

    @Test
    public void getGender() {
        assertNotNull(gender.getGender());
        System.out.println(gender.getGender());
    }
}
