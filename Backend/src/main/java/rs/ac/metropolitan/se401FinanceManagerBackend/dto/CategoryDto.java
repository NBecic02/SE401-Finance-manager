package rs.ac.metropolitan.se401FinanceManagerBackend.dto;

import lombok.Data;

@Data
public class CategoryDto {
    private Integer categoryId;
    private String categoryName;
    private String categoryDescription;
}
