package com.example.prueba.Controller;

import com.example.prueba.Entity.Category;
import com.example.prueba.Repository.CategoryRepository;
import com.example.prueba.Service.CategoryService;
import com.example.prueba.Service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping("/category")
    void saveCategoryRepository(@RequestBody Category category){
        categoryService.save(category);
    }
    @GetMapping("/category2")
    public ResponseEntity<List<Category>> returnCategoryRepository(){
        return new ResponseEntity<List<Category>>(categoryService.findAll(),null, HttpStatus.CREATED);
    }
}
