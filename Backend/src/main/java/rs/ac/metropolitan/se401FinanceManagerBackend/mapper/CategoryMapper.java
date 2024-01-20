package rs.ac.metropolitan.se401FinanceManagerBackend.mapper;

import org.mapstruct.Mapper;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.Category;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.CategoryDto;

import java.util.List;
@Mapper
public interface CategoryMapper {
    List<CategoryDto> mapCategoryListToCategoryDtoList(List<Category> categories);

    CategoryDto mapCategoryToCategoryDto(Category category);

    List<rs.ac.metropolitan.se401FinanceManagerBackend.model.Category> mapCategoryDtoListToCategoryList(List<CategoryDto> categoryDtoList);
}
