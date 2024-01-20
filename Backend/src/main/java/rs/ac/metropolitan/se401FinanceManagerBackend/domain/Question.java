package rs.ac.metropolitan.se401FinanceManagerBackend.domain;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(generator = "QuestionSeq")
    @SequenceGenerator(name = "QuestionSeq", sequenceName = "questions_sequence")
    private Integer questionId;
    private String question;
    private String answer;

}
