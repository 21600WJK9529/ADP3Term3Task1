package ac.za.winston.factory.demography;

import ac.za.winston.domain.demography.Gender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    Gender gender;
    @Before
    public void setUp() throws Exception {
        gender = GenderFactory.buildGender("TestEmpNo", "TestGender");
    }

    @Test
    public void buildGender() {
        assertNotNull(gender);
        System.out.println(gender);
    }
}
