package ac.za.winston.service.demography;

import ac.za.winston.domain.demography.Race;
import ac.za.winston.service.IService;

import java.util.Set;

public interface IRaceService extends IService<Race, String> {
    Set<Race> getAll();
}
