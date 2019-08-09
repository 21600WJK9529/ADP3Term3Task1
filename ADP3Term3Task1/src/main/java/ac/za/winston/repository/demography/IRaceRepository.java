package ac.za.winston.repository.demography;

import ac.za.winston.domain.demography.Race;
import ac.za.winston.repository.IRepository;

import java.util.Set;

public interface IRaceRepository extends IRepository<Race, String> {
    Set<Race> getAll();
}
