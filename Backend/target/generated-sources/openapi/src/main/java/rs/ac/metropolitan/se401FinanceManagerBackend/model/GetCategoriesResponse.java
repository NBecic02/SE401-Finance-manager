package rs.ac.metropolitan.se401FinanceManagerBackend.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.Category;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetCategoriesResponse
 */

public class GetCategoriesResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("categoryList")
  @Valid
  private List<Category> categoryList = null;

  public GetCategoriesResponse categoryList(List<Category> categoryList) {
    this.categoryList = categoryList;
    return this;
  }

  public GetCategoriesResponse addCategoryListItem(Category categoryListItem) {
    if (this.categoryList == null) {
      this.categoryList = new ArrayList<>();
    }
    this.categoryList.add(categoryListItem);
    return this;
  }

  /**
   * Get categoryList
   * @return categoryList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Category> getCategoryList() {
    return categoryList;
  }

  public void setCategoryList(List<Category> categoryList) {
    this.categoryList = categoryList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCategoriesResponse getCategoriesResponse = (GetCategoriesResponse) o;
    return Objects.equals(this.categoryList, getCategoriesResponse.categoryList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCategoriesResponse {\n");
    
    sb.append("    categoryList: ").append(toIndentedString(categoryList)).append("\n");
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

