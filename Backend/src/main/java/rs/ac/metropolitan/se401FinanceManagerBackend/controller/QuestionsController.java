package rs.ac.metropolitan.se401FinanceManagerBackend.controller;

import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.QuestionDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.mapper.QuestionMapper;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.*;
import rs.ac.metropolitan.se401FinanceManagerBackend.service.QuestionService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class QuestionsController implements QuestionsApi {
    private static final QuestionMapper MAPPER = Mappers.getMapper((QuestionMapper.class));
    private final QuestionService questionService;

    @Override
    public ResponseEntity<GetQuestionsResponse> getQuestions() {
        List<QuestionDto> questionDtos = questionService.getAllQuestions();
        List<Question> questions = MAPPER.mapQuestionDtosListToQuestionModelList(questionDtos);
        GetQuestionsResponse response = new GetQuestionsResponse();
        response.setQuestionList(questions);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<GetQuestionByIdResponse> getQuestionById(Integer questionId) {
        QuestionDto questionDto = questionService.getQuestionById(questionId);
        GetQuestionByIdResponse response = MAPPER.mapQuestionDtoToGetQuestionByIdResponse(questionDto);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<CreateQuestionResponse> createQuestion(CreateQuestionRequest createQuestionRequest) {
        QuestionDto questionDto = MAPPER.mapCreateQuestionRequestToQuestionDto(createQuestionRequest);
        QuestionDto createdQuestionDto = questionService.saveQuestion(questionDto);
        CreateQuestionResponse response = MAPPER.mapQuestionDtoToCreateQuestionResponse(createdQuestionDto);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<UpdateQuestionResponse> updateQuestion(Integer questionId, UpdateQuestionRequest updateQuestionRequest) {
        QuestionDto questionDto = MAPPER.mapUpdateQuestionRequestToQuestionDto(updateQuestionRequest);
        QuestionDto updatedQuestionDto = questionService.updateQuestion(questionId, questionDto);
        UpdateQuestionResponse response = MAPPER.mapQuestionDtoToUpdateQuestionResponse(updatedQuestionDto);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<Void> deleteQuestion(Integer questionId) {
        questionService.deleteQuestionById(questionId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
