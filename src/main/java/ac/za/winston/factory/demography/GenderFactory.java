package ac.za.winston.factory.demography;

import ac.za.winston.domain.demography.Gender;

public class GenderFactory {

    public static Gender buildGender(String empNo, String gender){
        return new Gender.Builder()
                    .empNo(empNo)
                    .gender(gender)
                    .Build();
    }

}
