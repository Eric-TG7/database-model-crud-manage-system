package com.example.prueba.Service;

import com.example.prueba.Repository.CategoryRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

 public abstract class CrudServiceImp<T,ID> implements CrudService<T,ID>{
     protected abstract  JpaRepository<T,ID> getRepository();


     @Override
     public T findById(ID id) {
         return getRepository().getReferenceById(id);
     }

     @Override
     public List<T> findAll() {
         return getRepository().findAll();
     }

     @Override
     public void save(T entity) {
         getRepository().save(entity);
     }

     @Override
     public void delete(T entity) {
         getRepository().delete(entity);
     }

     @Override
     public T update(T entity) {
         return getRepository().save(entity) ;
     }
}
