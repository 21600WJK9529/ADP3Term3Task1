package ac.za.winston.repository.demography;

import ac.za.winston.domain.demography.Gender;
import ac.za.winston.repository.IRepository;

import java.util.Set;

public interface IGenderRepository extends IRepository<Gender, String> {
    Set<Gender> getAll();
}
