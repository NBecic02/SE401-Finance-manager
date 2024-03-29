package rs.ac.metropolitan.se401FinanceManagerBackend.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.Expense;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of Expenses
 */
@ApiModel(description = "List of Expenses")

public class ExpenseList extends ArrayList<Expense> implements Serializable {
  private static final long serialVersionUID = 1L;


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

