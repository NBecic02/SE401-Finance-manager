package rs.ac.metropolitan.se401FinanceManagerBackend.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Category
 */

public class Category  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("category_id")
  private Integer categoryId = null;

  @JsonProperty("category_name")
  private String categoryName = null;

  @JsonProperty("category_description")
  private String categoryDescription = null;

  public Category categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  **/
  @ApiModelProperty(example = "1", value = "")


  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public Category categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * Get categoryName
   * @return categoryName
  **/
  @ApiModelProperty(example = "House", value = "")

@Size(min=2,max=10) 
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public Category categoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
    return this;
  }

  /**
   * Get categoryDescription
   * @return categoryDescription
  **/
  @ApiModelProperty(example = "House", value = "")

@Size(min=2,max=100) 
  public String getCategoryDescription() {
    return categoryDescription;
  }

  public void setCategoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.categoryId, category.categoryId) &&
        Objects.equals(this.categoryName, category.categoryName) &&
        Objects.equals(this.categoryDescription, category.categoryDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, categoryName, categoryDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    categoryDescription: ").append(toIndentedString(categoryDescription)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

