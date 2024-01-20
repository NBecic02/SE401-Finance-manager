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
 * IncomeRequest
 */

public class IncomeRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("earning")
  private BigDecimal earning = null;

  @JsonProperty("category")
  private Category category = null;

  public IncomeRequest date(OffsetDateTime date) {
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

  public IncomeRequest source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(example = "Posao", value = "")

@Size(min=2,max=40) 
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public IncomeRequest earning(BigDecimal earning) {
    this.earning = earning;
    return this;
  }

  /**
   * Get earning
   * @return earning
  **/
  @ApiModelProperty(example = "7000", value = "")

  @Valid

  public BigDecimal getEarning() {
    return earning;
  }

  public void setEarning(BigDecimal earning) {
    this.earning = earning;
  }

  public IncomeRequest category(Category category) {
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
    IncomeRequest incomeRequest = (IncomeRequest) o;
    return Objects.equals(this.date, incomeRequest.date) &&
        Objects.equals(this.source, incomeRequest.source) &&
        Objects.equals(this.earning, incomeRequest.earning) &&
        Objects.equals(this.category, incomeRequest.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, source, earning, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeRequest {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    earning: ").append(toIndentedString(earning)).append("\n");
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

