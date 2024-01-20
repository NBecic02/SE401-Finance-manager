package rs.ac.metropolitan.se401FinanceManagerBackend.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.Question;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetQuestionsResponse
 */

public class GetQuestionsResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("questionList")
  @Valid
  private List<Question> questionList = null;

  public GetQuestionsResponse questionList(List<Question> questionList) {
    this.questionList = questionList;
    return this;
  }

  public GetQuestionsResponse addQuestionListItem(Question questionListItem) {
    if (this.questionList == null) {
      this.questionList = new ArrayList<>();
    }
    this.questionList.add(questionListItem);
    return this;
  }

  /**
   * Get questionList
   * @return questionList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Question> getQuestionList() {
    return questionList;
  }

  public void setQuestionList(List<Question> questionList) {
    this.questionList = questionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetQuestionsResponse getQuestionsResponse = (GetQuestionsResponse) o;
    return Objects.equals(this.questionList, getQuestionsResponse.questionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQuestionsResponse {\n");
    
    sb.append("    questionList: ").append(toIndentedString(questionList)).append("\n");
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

