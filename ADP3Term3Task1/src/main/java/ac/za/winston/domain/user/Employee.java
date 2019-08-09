package ac.za.winston.domain.user;

import ac.za.winston.domain.demography.Gender;
import ac.za.winston.domain.demography.Race;

public class Employee {

    private String empNo, firstName, surname;
    private Gender gender;
    private Race race;

    public Employee(Employee.Builder Build){
        this.empNo=Build.empNo;
        this.firstName=Build.firstName;
        this.surname=Build.surname;
        this.gender=Build.gender;
        this.race=Build.race;
    }
    public static class Builder{

        private String empNo,firstName,surname;
        private Gender gender;
        private Race race;

        public Builder empNo(String empNo){
            this.empNo=empNo;
            return this;
        }
        public Builder firstName(String firstName){
            this.firstName=firstName;
            return this;
        }
        public Builder surname(String surname){
            this.surname=surname;
            return this;
        }
        public Builder gender(Gender gender){
            this.gender=gender;
            return this;
        }
        public Builder race(Race race){
            this.race=race;
            return this;
        }
        public Employee Build(){
            return new Employee(this);
        }
    }
    public String getEmpNo() {
        return empNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public Race getRace() {
        return race;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo='" + empNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", race=" + race +
                '}';
    }
}
