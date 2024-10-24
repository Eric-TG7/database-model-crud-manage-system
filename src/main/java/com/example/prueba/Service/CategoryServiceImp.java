package com.example.prueba.Service;

import com.example.prueba.Entity.Category;
import com.example.prueba.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImp extends CrudServiceImp<Category,Long> implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    protected JpaRepository<Category, Long> getRepository() {
        return categoryRepository;
    }

}
