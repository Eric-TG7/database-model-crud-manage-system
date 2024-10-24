package com.example.prueba.Service;

import java.util.List;

public interface CrudService<T,ID> {
    T findById(ID id);
    List<T> findAll();
    void save(T t);
    void delete(T t);
    T update(T t);
}
