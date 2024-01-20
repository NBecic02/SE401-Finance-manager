package rs.ac.metropolitan.se401FinanceManagerBackend.dto;

import lombok.Data;

@Data
public class QuestionDto {
    private Integer questionId;
    private String question;
    private String answer;
}
