package rs.ac.metropolitan.se401FinanceManagerBackend.service;


import rs.ac.metropolitan.se401FinanceManagerBackend.dto.QuestionDto;

import java.util.List;

public interface QuestionService {
    List<QuestionDto> getAllQuestions();

    QuestionDto getQuestionById(Integer questionId);

    QuestionDto saveQuestion(QuestionDto questionDto);

    QuestionDto updateQuestion(Integer questionId, QuestionDto questionDto);

    void deleteQuestionById(Integer questionId);
}
