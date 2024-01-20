package rs.ac.metropolitan.se401FinanceManagerBackend.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.Question;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.QuestionDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.CreateQuestionRequest;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.CreateQuestionResponse;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.GetQuestionByIdResponse;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.UpdateQuestionRequest;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.UpdateQuestionResponse;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-20T23:30:18+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class QuestionMapperImpl implements QuestionMapper {

    @Override
    public QuestionDto mapQuestionEntityToQuestionDto(Question question) {
        if ( question == null ) {
            return null;
        }

        QuestionDto questionDto = new QuestionDto();

        questionDto.setQuestionId( question.getQuestionId() );
        questionDto.setQuestion( question.getQuestion() );
        questionDto.setAnswer( question.getAnswer() );

        return questionDto;
    }

    @Override
    public Question mapQuestionDtoToQuestionEntity(QuestionDto questionDto) {
        if ( questionDto == null ) {
            return null;
        }

        Question question = new Question();

        question.setQuestionId( questionDto.getQuestionId() );
        question.setQuestion( questionDto.getQuestion() );
        question.setAnswer( questionDto.getAnswer() );

        return question;
    }

    @Override
    public List<QuestionDto> mapQuestionsListToQuestionDtoList(List<Question> questions) {
        if ( questions == null ) {
            return null;
        }

        List<QuestionDto> list = new ArrayList<QuestionDto>( questions.size() );
        for ( Question question : questions ) {
            list.add( mapQuestionEntityToQuestionDto( question ) );
        }

        return list;
    }

    @Override
    public QuestionDto mapCreateQuestionRequestToQuestionDto(CreateQuestionRequest createQuestionRequest) {
        if ( createQuestionRequest == null ) {
            return null;
        }

        QuestionDto questionDto = new QuestionDto();

        questionDto.setQuestion( createQuestionRequest.getQuestion() );
        questionDto.setAnswer( createQuestionRequest.getAnswer() );

        return questionDto;
    }

    @Override
    public CreateQuestionResponse mapQuestionDtoToCreateQuestionResponse(QuestionDto createdQuestionDto) {
        if ( createdQuestionDto == null ) {
            return null;
        }

        CreateQuestionResponse createQuestionResponse = new CreateQuestionResponse();

        createQuestionResponse.setQuestionId( createdQuestionDto.getQuestionId() );
        createQuestionResponse.setQuestion( createdQuestionDto.getQuestion() );
        createQuestionResponse.setAnswer( createdQuestionDto.getAnswer() );

        return createQuestionResponse;
    }

    @Override
    public GetQuestionByIdResponse mapQuestionDtoToGetQuestionByIdResponse(QuestionDto questionDto) {
        if ( questionDto == null ) {
            return null;
        }

        GetQuestionByIdResponse getQuestionByIdResponse = new GetQuestionByIdResponse();

        getQuestionByIdResponse.setQuestionId( questionDto.getQuestionId() );
        getQuestionByIdResponse.setQuestion( questionDto.getQuestion() );
        getQuestionByIdResponse.setAnswer( questionDto.getAnswer() );

        return getQuestionByIdResponse;
    }

    @Override
    public QuestionDto mapUpdateQuestionRequestToQuestionDto(UpdateQuestionRequest updateQuestionRequest) {
        if ( updateQuestionRequest == null ) {
            return null;
        }

        QuestionDto questionDto = new QuestionDto();

        questionDto.setQuestion( updateQuestionRequest.getQuestion() );
        questionDto.setAnswer( updateQuestionRequest.getAnswer() );

        return questionDto;
    }

    @Override
    public UpdateQuestionResponse mapQuestionDtoToUpdateQuestionResponse(QuestionDto updatedQuestionDto) {
        if ( updatedQuestionDto == null ) {
            return null;
        }

        UpdateQuestionResponse updateQuestionResponse = new UpdateQuestionResponse();

        updateQuestionResponse.setQuestionId( updatedQuestionDto.getQuestionId() );
        updateQuestionResponse.setQuestion( updatedQuestionDto.getQuestion() );
        updateQuestionResponse.setAnswer( updatedQuestionDto.getAnswer() );

        return updateQuestionResponse;
    }

    @Override
    public List<rs.ac.metropolitan.se401FinanceManagerBackend.model.Question> mapQuestionDtosListToQuestionModelList(List<QuestionDto> questionDtos) {
        if ( questionDtos == null ) {
            return null;
        }

        List<rs.ac.metropolitan.se401FinanceManagerBackend.model.Question> list = new ArrayList<rs.ac.metropolitan.se401FinanceManagerBackend.model.Question>( questionDtos.size() );
        for ( QuestionDto questionDto : questionDtos ) {
            list.add( questionDtoToQuestion( questionDto ) );
        }

        return list;
    }

    protected rs.ac.metropolitan.se401FinanceManagerBackend.model.Question questionDtoToQuestion(QuestionDto questionDto) {
        if ( questionDto == null ) {
            return null;
        }

        rs.ac.metropolitan.se401FinanceManagerBackend.model.Question question = new rs.ac.metropolitan.se401FinanceManagerBackend.model.Question();

        question.setQuestionId( questionDto.getQuestionId() );
        question.setQuestion( questionDto.getQuestion() );
        question.setAnswer( questionDto.getAnswer() );

        return question;
    }
}
