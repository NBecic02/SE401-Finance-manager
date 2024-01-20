package rs.ac.metropolitan.se401FinanceManagerBackend.service;

import rs.ac.metropolitan.se401FinanceManagerBackend.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAllCategories();
    CategoryDto getCategoryById(Integer categoryId);
}
