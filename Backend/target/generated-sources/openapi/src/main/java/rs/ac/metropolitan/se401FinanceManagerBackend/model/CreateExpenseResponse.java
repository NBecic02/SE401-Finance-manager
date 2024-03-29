package rs.ac.metropolitan.se401FinanceManagerBackend.model;

import java.util.Objects;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.Category;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.CurrentUser;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.Expense;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateExpenseResponse
 */

public class CreateExpenseResponse extends Expense implements Serializable {
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
    sb.append("class CreateExpenseResponse {\n");
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

