package rs.ac.metropolitan.se401FinanceManagerBackend.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.Category;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.CategoryDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-21T06:37:31+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public List<CategoryDto> mapCategoryListToCategoryDtoList(List<Category> categories) {
        if ( categories == null ) {
            return null;
        }

        List<CategoryDto> list = new ArrayList<CategoryDto>( categories.size() );
        for ( Category category : categories ) {
            list.add( mapCategoryToCategoryDto( category ) );
        }

        return list;
    }

    @Override
    public CategoryDto mapCategoryToCategoryDto(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setCategoryId( category.getCategoryId() );
        categoryDto.setCategoryName( category.getCategoryName() );
        categoryDto.setCategoryDescription( category.getCategoryDescription() );

        return categoryDto;
    }

    @Override
    public List<rs.ac.metropolitan.se401FinanceManagerBackend.model.Category> mapCategoryDtoListToCategoryList(List<CategoryDto> categoryDtoList) {
        if ( categoryDtoList == null ) {
            return null;
        }

        List<rs.ac.metropolitan.se401FinanceManagerBackend.model.Category> list = new ArrayList<rs.ac.metropolitan.se401FinanceManagerBackend.model.Category>( categoryDtoList.size() );
        for ( CategoryDto categoryDto : categoryDtoList ) {
            list.add( categoryDtoToCategory( categoryDto ) );
        }

        return list;
    }

    protected rs.ac.metropolitan.se401FinanceManagerBackend.model.Category categoryDtoToCategory(CategoryDto categoryDto) {
        if ( categoryDto == null ) {
            return null;
        }

        rs.ac.metropolitan.se401FinanceManagerBackend.model.Category category = new rs.ac.metropolitan.se401FinanceManagerBackend.model.Category();

        category.setCategoryId( categoryDto.getCategoryId() );
        category.setCategoryName( categoryDto.getCategoryName() );
        category.setCategoryDescription( categoryDto.getCategoryDescription() );

        return category;
    }
}
