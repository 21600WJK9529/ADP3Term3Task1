package ac.za.winston.repository.demography;

import ac.za.winston.domain.demography.Gender;

import java.util.HashSet;
import java.util.Set;

public class GenderRepository implements IGenderRepository {

    public static GenderRepository repository;
    private Set<Gender> genders;

    private GenderRepository() {
        this.genders = new HashSet<>();
    }

    public static GenderRepository getRepository(){
        if(repository == null) repository = new GenderRepository();
        return repository;
    }

    @Override
    public Set<Gender> getAll() {
        return genders;
    }

    @Override
    public Gender create(Gender gender) {
        if(read(gender.getEmpNo()) == null){
            genders.add(gender);
        }
        return gender;
    }

    @Override
    public Gender read(String s) {
        return genders.stream()
                .filter(gender -> s.equalsIgnoreCase(gender.getEmpNo()))
                .findAny()
                .orElse(null);
    }

    @Override
    public Gender update(Gender gender) {

        if(read(gender.getEmpNo()) != null){
            delete(gender.getEmpNo());
            create(gender);
        }
        return gender;
    }

    @Override
    public void delete(String s) {
        Gender gender = read(s);
        this.genders.remove(gender);
    }
}
