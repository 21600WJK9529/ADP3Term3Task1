package ac.za.winston.domain.demography;

public class Gender {
    private String gender,empNo;

    public Gender(Gender.Builder Build){
        this.gender=Build.gender;
        this.empNo=Build.empNo;
    }

    public static class Builder{
        private String gender,empNo;

        public Builder gender(String gender){
            this.gender = gender;
            return this;
        }
        public Builder empNo(String empNo){
            this.empNo=empNo;
            return this;
        }
        public Gender Build(){
            return new Gender(this);
        }
    }

    public String getGender() {
        return gender;
    }

    public String getEmpNo() {
        return empNo;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "gender='" + gender + '\'' +
                ", empNo='" + empNo + '\'' +
                '}';
    }
}
