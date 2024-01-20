package rs.ac.metropolitan.se401FinanceManagerBackend.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.Category;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.CurrentUser;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Expense
 */

public class Expense  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("expenseId")
  private Integer expenseId = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("shop")
  private String shop = null;

  @JsonProperty("cost")
  private BigDecimal cost = null;

  @JsonProperty("user")
  private CurrentUser user = null;

  @JsonProperty("category")
  private Category category = null;

  public Expense expenseId(Integer expenseId) {
    this.expenseId = expenseId;
    return this;
  }

  /**
   * Get expenseId
   * @return expenseId
  **/
  @ApiModelProperty(example = "10", value = "")


  public Integer getExpenseId() {
    return expenseId;
  }

  public void setExpenseId(Integer expenseId) {
    this.expenseId = expenseId;
  }

  public Expense date(OffsetDateTime date) {
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

  public Expense shop(String shop) {
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

  public Expense cost(BigDecimal cost) {
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

  public Expense user(CurrentUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CurrentUser getUser() {
    return user;
  }

  public void setUser(CurrentUser user) {
    this.user = user;
  }

  public Expense category(Category category) {
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
    Expense expense = (Expense) o;
    return Objects.equals(this.expenseId, expense.expenseId) &&
        Objects.equals(this.date, expense.date) &&
        Objects.equals(this.shop, expense.shop) &&
        Objects.equals(this.cost, expense.cost) &&
        Objects.equals(this.user, expense.user) &&
        Objects.equals(this.category, expense.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expenseId, date, shop, cost, user, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expense {\n");
    
    sb.append("    expenseId: ").append(toIndentedString(expenseId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

