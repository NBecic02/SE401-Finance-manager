package rs.ac.metropolitan.se401FinanceManagerBackend.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.ExpenseList;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.PagedResponse;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.PagedResponseSort;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetExpensesResponse
 */

public class GetExpensesResponse extends PagedResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("expenseList")
  private ExpenseList expenseList = null;

  public GetExpensesResponse expenseList(ExpenseList expenseList) {
    this.expenseList = expenseList;
    return this;
  }

  /**
   * Get expenseList
   * @return expenseList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ExpenseList getExpenseList() {
    return expenseList;
  }

  public void setExpenseList(ExpenseList expenseList) {
    this.expenseList = expenseList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetExpensesResponse getExpensesResponse = (GetExpensesResponse) o;
    return Objects.equals(this.expenseList, getExpensesResponse.expenseList) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expenseList, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExpensesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    expenseList: ").append(toIndentedString(expenseList)).append("\n");
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

