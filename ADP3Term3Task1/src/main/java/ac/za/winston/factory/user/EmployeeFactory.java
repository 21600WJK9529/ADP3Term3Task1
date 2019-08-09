package ac.za.winston.factory.user;

import ac.za.winston.domain.demography.Gender;
import ac.za.winston.domain.demography.Race;
import ac.za.winston.domain.user.Employee;
import ac.za.winston.factory.demography.GenderFactory;
import ac.za.winston.factory.demography.RaceFactory;

public class EmployeeFactory {

    public static Employee buildEmployee(String empNo, String firstName, String surname, String gender, String race){
        Gender genderBuild= GenderFactory.buildGender(empNo, gender);
        Race raceBuild= RaceFactory.buildRace(empNo,race);
        return new Employee.Builder()
                .empNo(empNo)
                .firstName(firstName)
                .surname(surname)
                .gender(genderBuild)
                .race(raceBuild)
                .Build();
    }
}
