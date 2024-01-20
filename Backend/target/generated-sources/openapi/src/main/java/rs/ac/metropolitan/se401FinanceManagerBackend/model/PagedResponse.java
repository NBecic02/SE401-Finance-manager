package rs.ac.metropolitan.se401FinanceManagerBackend.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.PagedResponseSort;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PagedResponse
 */

public class PagedResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("totalPages")
  private Integer totalPages = null;

  @JsonProperty("totalElements")
  private Integer totalElements = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("pageNumber")
  private Integer pageNumber = null;

  @JsonProperty("isFirst")
  private Boolean isFirst = null;

  @JsonProperty("isLast")
  private Boolean isLast = null;

  @JsonProperty("sort")
  private PagedResponseSort sort = null;

  public PagedResponse totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(example = "6", value = "")


  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public PagedResponse totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  **/
  @ApiModelProperty(example = "52", value = "")


  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public PagedResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(example = "10", value = "")


  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public PagedResponse pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Get pageNumber
   * @return pageNumber
  **/
  @ApiModelProperty(example = "3", value = "")


  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public PagedResponse isFirst(Boolean isFirst) {
    this.isFirst = isFirst;
    return this;
  }

  /**
   * Get isFirst
   * @return isFirst
  **/
  @ApiModelProperty(value = "")


  public Boolean getIsFirst() {
    return isFirst;
  }

  public void setIsFirst(Boolean isFirst) {
    this.isFirst = isFirst;
  }

  public PagedResponse isLast(Boolean isLast) {
    this.isLast = isLast;
    return this;
  }

  /**
   * Get isLast
   * @return isLast
  **/
  @ApiModelProperty(value = "")


  public Boolean getIsLast() {
    return isLast;
  }

  public void setIsLast(Boolean isLast) {
    this.isLast = isLast;
  }

  public PagedResponse sort(PagedResponseSort sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PagedResponseSort getSort() {
    return sort;
  }

  public void setSort(PagedResponseSort sort) {
    this.sort = sort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedResponse pagedResponse = (PagedResponse) o;
    return Objects.equals(this.totalPages, pagedResponse.totalPages) &&
        Objects.equals(this.totalElements, pagedResponse.totalElements) &&
        Objects.equals(this.pageSize, pagedResponse.pageSize) &&
        Objects.equals(this.pageNumber, pagedResponse.pageNumber) &&
        Objects.equals(this.isFirst, pagedResponse.isFirst) &&
        Objects.equals(this.isLast, pagedResponse.isLast) &&
        Objects.equals(this.sort, pagedResponse.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPages, totalElements, pageSize, pageNumber, isFirst, isLast, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResponse {\n");
    
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    isFirst: ").append(toIndentedString(isFirst)).append("\n");
    sb.append("    isLast: ").append(toIndentedString(isLast)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

