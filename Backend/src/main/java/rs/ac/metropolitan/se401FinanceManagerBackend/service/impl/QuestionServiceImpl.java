package rs.ac.metropolitan.se401FinanceManagerBackend.service.impl;

import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.Question;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.QuestionDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.exceptions.QuestionNotFoundException;
import rs.ac.metropolitan.se401FinanceManagerBackend.mapper.QuestionMapper;
import rs.ac.metropolitan.se401FinanceManagerBackend.repository.QuestionsRepository;
import rs.ac.metropolitan.se401FinanceManagerBackend.service.QuestionService;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class QuestionServiceImpl implements QuestionService {
    private static final QuestionMapper MAPPER = Mappers.getMapper((QuestionMapper.class));
    private final QuestionsRepository questionsRepository;
    @Override
    public List<QuestionDto> getAllQuestions() {
        List<Question> questions = questionsRepository.findAll();
        return MAPPER.mapQuestionsListToQuestionDtoList(questions);
    }

    @Override
    public QuestionDto getQuestionById(Integer questionId) {
        Question question = questionsRepository.findById(questionId)
                .orElseThrow(() -> new QuestionNotFoundException("Question with ID: " + questionId + " doesn't exist!"));
        return MAPPER.mapQuestionEntityToQuestionDto(question);
    }

    @Override
    public QuestionDto saveQuestion(QuestionDto questionDto) {
        Question question = MAPPER.mapQuestionDtoToQuestionEntity(questionDto);
        Question savedQuestion = questionsRepository.save(question);
        return MAPPER.mapQuestionEntityToQuestionDto(savedQuestion);
    }

    @Override
    public QuestionDto updateQuestion(Integer questionId, QuestionDto questionDto) {
        Question question = questionsRepository.findById(questionId)
                .orElseThrow(() -> new QuestionNotFoundException("Question with ID: " + questionId + " doesn't exist!"));
        question = MAPPER.mapQuestionDtoToQuestionEntity(questionDto);
        question.setQuestionId(questionId);
        Question savedQuestion = questionsRepository.save(question);
        return MAPPER.mapQuestionEntityToQuestionDto(savedQuestion);
    }

    @Override
    public void deleteQuestionById(Integer questionId) {
        questionsRepository.deleteById(questionId);
    }
}
