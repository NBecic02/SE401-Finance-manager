package rs.ac.metropolitan.se401FinanceManagerBackend.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.Category;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExpenseRequest
 */

public class ExpenseRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("shop")
  private String shop = null;

  @JsonProperty("cost")
  private BigDecimal cost = null;

  @JsonProperty("category")
  private Category category = null;

  public ExpenseRequest date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public ExpenseRequest shop(String shop) {
    this.shop = shop;
    return this;
  }

  /**
   * Get shop
   * @return shop
  **/
  @ApiModelProperty(example = "Maxi", value = "")

@Size(min=2,max=40) 
  public String getShop() {
    return shop;
  }

  public void setShop(String shop) {
    this.shop = shop;
  }

  public ExpenseRequest cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(example = "2540.5", value = "")

  @Valid

  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  public ExpenseRequest category(Category category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseRequest expenseRequest = (ExpenseRequest) o;
    return Objects.equals(this.date, expenseRequest.date) &&
        Objects.equals(this.shop, expenseRequest.shop) &&
        Objects.equals(this.cost, expenseRequest.cost) &&
        Objects.equals(this.category, expenseRequest.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, shop, cost, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseRequest {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

