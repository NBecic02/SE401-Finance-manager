package rs.ac.metropolitan.se401FinanceManagerBackend.controller;

import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.CategoryDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.mapper.CategoryMapper;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.Category;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.GetCategoriesResponse;
import rs.ac.metropolitan.se401FinanceManagerBackend.service.CategoryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CategoryController implements CategoriesApi {
    private static final CategoryMapper MAPPER = Mappers.getMapper((CategoryMapper.class));
    private final CategoryService categoryService;

    @Override
    public ResponseEntity<GetCategoriesResponse> getCategories() {
        List<CategoryDto> categoryDtoList = categoryService.getAllCategories();
        List<Category> categories = MAPPER.mapCategoryDtoListToCategoryList(categoryDtoList);
        GetCategoriesResponse response = new GetCategoriesResponse();
        response.setCategoryList(categories);
        return ResponseEntity.ok(response);
    }
}
