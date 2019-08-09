package ac.za.winston.domain.demography;

public class Race {
    private String race,empNo;

    public Race(Race.Builder Build){
        this.race=Build.race;
        this.empNo=Build.empNo;
    }

    public static class Builder{
        private String race,empNo;

        public Builder race(String race){
            this.race = race;
            return this;
        }
        public Builder empNo(String empNo){
            this.empNo=empNo;
            return this;
        }
        public Race Build(){
            return new Race(this);
        }
    }

    public String getRace() {
        return race;
    }

    public String getEmpNo() {
        return empNo;
    }

    @Override
    public String toString() {
        return "Race{" +
                "race='" + race + '\'' +
                ", empNo='" + empNo + '\'' +
                '}';
    }
}
