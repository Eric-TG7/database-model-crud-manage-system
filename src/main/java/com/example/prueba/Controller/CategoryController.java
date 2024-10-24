package com.example.prueba.Controller;

import com.example.prueba.Entity.Category;
import com.example.prueba.Service.CategoryService;
import com.example.prueba.Service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    @PostMapping("/Category")
    void saveCategoryRepository(@RequestBody Category category){
        categoryService.save(category);
    }

}
