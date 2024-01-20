package rs.ac.metropolitan.se401FinanceManagerBackend.service.impl;

import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.Category;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.CategoryDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.exceptions.CategoryNotFoundException;
import rs.ac.metropolitan.se401FinanceManagerBackend.mapper.CategoryMapper;
import rs.ac.metropolitan.se401FinanceManagerBackend.repository.CategoryRepository;
import rs.ac.metropolitan.se401FinanceManagerBackend.service.CategoryService;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoryServiceImpl implements CategoryService {
    private static final CategoryMapper MAPPER = Mappers.getMapper((CategoryMapper.class));
    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        return MAPPER.mapCategoryListToCategoryDtoList(categories);
    }

    @Override
    public CategoryDto getCategoryById(Integer categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new CategoryNotFoundException("Category with id: " + categoryId + " not found!!!"));
        return MAPPER.mapCategoryToCategoryDto(category);
    }
}
