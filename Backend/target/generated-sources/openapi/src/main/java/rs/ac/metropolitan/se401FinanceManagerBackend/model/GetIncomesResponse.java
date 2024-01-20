package rs.ac.metropolitan.se401FinanceManagerBackend.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.IncomeList;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.PagedResponse;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.PagedResponseSort;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetIncomesResponse
 */

public class GetIncomesResponse extends PagedResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("incomeList")
  private IncomeList incomeList = null;

  public GetIncomesResponse incomeList(IncomeList incomeList) {
    this.incomeList = incomeList;
    return this;
  }

  /**
   * Get incomeList
   * @return incomeList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public IncomeList getIncomeList() {
    return incomeList;
  }

  public void setIncomeList(IncomeList incomeList) {
    this.incomeList = incomeList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIncomesResponse getIncomesResponse = (GetIncomesResponse) o;
    return Objects.equals(this.incomeList, getIncomesResponse.incomeList) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incomeList, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIncomesResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    incomeList: ").append(toIndentedString(incomeList)).append("\n");
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

