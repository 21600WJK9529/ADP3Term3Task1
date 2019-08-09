package ac.za.winston.service;

public interface IService<T,ID> {

    T create(T t);
    T read(ID id);
    T update(T t);
    void delete(ID id);
}
