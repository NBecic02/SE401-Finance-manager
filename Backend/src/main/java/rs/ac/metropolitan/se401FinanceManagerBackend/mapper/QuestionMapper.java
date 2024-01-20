package rs.ac.metropolitan.se401FinanceManagerBackend.mapper;

import org.mapstruct.Mapper;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.Question;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.QuestionDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.*;

import java.util.List;

@Mapper
public interface QuestionMapper {
    QuestionDto mapQuestionEntityToQuestionDto(Question question);

    Question mapQuestionDtoToQuestionEntity(QuestionDto questionDto);

    List<QuestionDto> mapQuestionsListToQuestionDtoList(List<Question> questions);

    QuestionDto mapCreateQuestionRequestToQuestionDto(CreateQuestionRequest createQuestionRequest);

    @ToCreateQuestionResponse
    CreateQuestionResponse mapQuestionDtoToCreateQuestionResponse(QuestionDto createdQuestionDto);

    @ToGetQuestionById
    GetQuestionByIdResponse mapQuestionDtoToGetQuestionByIdResponse(QuestionDto questionDto);

    QuestionDto mapUpdateQuestionRequestToQuestionDto(UpdateQuestionRequest updateQuestionRequest);

    @ToUpdateQuestionResponse
    UpdateQuestionResponse mapQuestionDtoToUpdateQuestionResponse(QuestionDto updatedQuestionDto);

    List<rs.ac.metropolitan.se401FinanceManagerBackend.model.Question> mapQuestionDtosListToQuestionModelList(List<QuestionDto> questionDtos);
}
