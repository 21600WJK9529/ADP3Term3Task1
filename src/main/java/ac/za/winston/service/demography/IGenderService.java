package ac.za.winston.service.demography;

import ac.za.winston.domain.demography.Gender;
import ac.za.winston.service.IService;

import java.util.Set;

public interface IGenderService extends IService<Gender, String> {
    Set<Gender> getAll();
}
