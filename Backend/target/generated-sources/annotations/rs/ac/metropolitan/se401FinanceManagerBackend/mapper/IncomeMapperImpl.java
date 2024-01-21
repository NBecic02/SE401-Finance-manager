package rs.ac.metropolitan.se401FinanceManagerBackend.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.data.domain.Page;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.Income;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.User;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.IncomeDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.IncomePageDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.SortDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.UserDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.CreateIncomeRequest;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.CreateIncomeResponse;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.CurrentUser;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.GetIncomeByIdResponse;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.GetIncomesResponse;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.IncomeList;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.PagedResponseSort;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.UpdateIncomeRequest;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.UpdateIncomeResponse;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-21T06:37:32+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class IncomeMapperImpl implements IncomeMapper {

    @Override
    public IncomePageDto mapIncomesToIncomePageDto(Page<Income> incomes) {
        if ( incomes == null ) {
            return null;
        }

        IncomePageDto incomePageDto = new IncomePageDto();

        incomePageDto.setPageNumber( incomes.getNumber() );
        incomePageDto.setPageSize( incomes.getSize() );
        if ( incomes.hasContent() ) {
            incomePageDto.setIncomeList( incomeListToIncomeDtoList( incomes.getContent() ) );
        }
        incomePageDto.setTotalPages( incomes.getTotalPages() );
        incomePageDto.setTotalElements( (int) incomes.getTotalElements() );
        incomePageDto.setFirst( incomes.isFirst() );
        incomePageDto.setLast( incomes.isLast() );
        incomePageDto.setSort( mapSort( incomes.getSort() ) );

        return incomePageDto;
    }

    @Override
    public GetIncomesResponse mapIncomePageDtotoGetIncomesResponse(IncomePageDto incomePageDto) {
        if ( incomePageDto == null ) {
            return null;
        }

        GetIncomesResponse getIncomesResponse = new GetIncomesResponse();

        getIncomesResponse.setIsFirst( incomePageDto.isFirst() );
        getIncomesResponse.setIsLast( incomePageDto.isLast() );
        getIncomesResponse.setTotalPages( incomePageDto.getTotalPages() );
        getIncomesResponse.setTotalElements( incomePageDto.getTotalElements() );
        getIncomesResponse.setPageSize( incomePageDto.getPageSize() );
        getIncomesResponse.setPageNumber( incomePageDto.getPageNumber() );
        getIncomesResponse.setSort( sortDtoToPagedResponseSort( incomePageDto.getSort() ) );
        getIncomesResponse.setIncomeList( incomeDtoListToIncomeList( incomePageDto.getIncomeList() ) );

        return getIncomesResponse;
    }

    @Override
    public rs.ac.metropolitan.se401FinanceManagerBackend.model.Income mapIncomeDtoToIncomeModel(IncomeDto incomeDto) {
        if ( incomeDto == null ) {
            return null;
        }

        rs.ac.metropolitan.se401FinanceManagerBackend.model.Income income = new rs.ac.metropolitan.se401FinanceManagerBackend.model.Income();

        income.setUser( userDtoToCurrentUser( incomeDto.getUserDto() ) );
        income.setIncomeId( incomeDto.getIncomeId() );
        income.setDate( incomeDto.getDate() );
        income.setSource( incomeDto.getSource() );
        income.setEarning( incomeDto.getEarning() );

        return income;
    }

    @Override
    public IncomeDto mapIncomeToIncomeDto(Income income) {
        if ( income == null ) {
            return null;
        }

        IncomeDto incomeDto = new IncomeDto();

        incomeDto.setUserDto( mapUserToUserDto( income.getUser() ) );
        incomeDto.setIncomeId( income.getIncomeId() );
        incomeDto.setDate( income.getDate() );
        incomeDto.setSource( income.getSource() );
        incomeDto.setEarning( income.getEarning() );

        return incomeDto;
    }

    @Override
    public GetIncomeByIdResponse mapIncomeDtoToResponse(IncomeDto incomeDtoByIncomeId) {
        if ( incomeDtoByIncomeId == null ) {
            return null;
        }

        GetIncomeByIdResponse getIncomeByIdResponse = new GetIncomeByIdResponse();

        getIncomeByIdResponse.setUser( userDtoToCurrentUser( incomeDtoByIncomeId.getUserDto() ) );
        getIncomeByIdResponse.setIncomeId( incomeDtoByIncomeId.getIncomeId() );
        getIncomeByIdResponse.setDate( incomeDtoByIncomeId.getDate() );
        getIncomeByIdResponse.setSource( incomeDtoByIncomeId.getSource() );
        getIncomeByIdResponse.setEarning( incomeDtoByIncomeId.getEarning() );

        return getIncomeByIdResponse;
    }

    @Override
    public Income mapIncomeDtoToIncome(IncomeDto incomeDto) {
        if ( incomeDto == null ) {
            return null;
        }

        Income income = new Income();

        income.setIncomeId( incomeDto.getIncomeId() );
        income.setDate( incomeDto.getDate() );
        income.setSource( incomeDto.getSource() );
        income.setEarning( incomeDto.getEarning() );

        return income;
    }

    @Override
    public UserDto mapUserToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setUserId( user.getUserId() );
        userDto.setFirstName( user.getFirstName() );
        userDto.setLastName( user.getLastName() );
        userDto.setUsername( user.getUsername() );
        userDto.setPassword( user.getPassword() );

        return userDto;
    }

    @Override
    public IncomeDto mapCreateIncomeRequestToIncomeDto(CreateIncomeRequest createIncomeRequest) {
        if ( createIncomeRequest == null ) {
            return null;
        }

        IncomeDto incomeDto = new IncomeDto();

        incomeDto.setDate( createIncomeRequest.getDate() );
        incomeDto.setSource( createIncomeRequest.getSource() );
        incomeDto.setEarning( createIncomeRequest.getEarning() );

        return incomeDto;
    }

    @Override
    public CreateIncomeResponse mapCreatedIncomeDtoToResponse(IncomeDto createdIncomeDto) {
        if ( createdIncomeDto == null ) {
            return null;
        }

        CreateIncomeResponse createIncomeResponse = new CreateIncomeResponse();

        createIncomeResponse.setUser( userDtoToCurrentUser( createdIncomeDto.getUserDto() ) );
        createIncomeResponse.setIncomeId( createdIncomeDto.getIncomeId() );
        createIncomeResponse.setDate( createdIncomeDto.getDate() );
        createIncomeResponse.setSource( createdIncomeDto.getSource() );
        createIncomeResponse.setEarning( createdIncomeDto.getEarning() );

        return createIncomeResponse;
    }

    @Override
    public IncomeDto mapUpdateIncomeRequestToIncomeDto(UpdateIncomeRequest updateIncomeRequest) {
        if ( updateIncomeRequest == null ) {
            return null;
        }

        IncomeDto incomeDto = new IncomeDto();

        incomeDto.setDate( updateIncomeRequest.getDate() );
        incomeDto.setSource( updateIncomeRequest.getSource() );
        incomeDto.setEarning( updateIncomeRequest.getEarning() );

        return incomeDto;
    }

    @Override
    public UpdateIncomeResponse mapUpdatedIncomeDtoToResponse(IncomeDto updatedIncomeDto) {
        if ( updatedIncomeDto == null ) {
            return null;
        }

        UpdateIncomeResponse updateIncomeResponse = new UpdateIncomeResponse();

        updateIncomeResponse.setUser( userDtoToCurrentUser( updatedIncomeDto.getUserDto() ) );
        updateIncomeResponse.setIncomeId( updatedIncomeDto.getIncomeId() );
        updateIncomeResponse.setDate( updatedIncomeDto.getDate() );
        updateIncomeResponse.setSource( updatedIncomeDto.getSource() );
        updateIncomeResponse.setEarning( updatedIncomeDto.getEarning() );

        return updateIncomeResponse;
    }

    protected List<IncomeDto> incomeListToIncomeDtoList(List<Income> list) {
        if ( list == null ) {
            return null;
        }

        List<IncomeDto> list1 = new ArrayList<IncomeDto>( list.size() );
        for ( Income income : list ) {
            list1.add( mapIncomeToIncomeDto( income ) );
        }

        return list1;
    }

    protected PagedResponseSort sortDtoToPagedResponseSort(SortDto sortDto) {
        if ( sortDto == null ) {
            return null;
        }

        PagedResponseSort pagedResponseSort = new PagedResponseSort();

        pagedResponseSort.setOrder( sortDto.getOrder() );
        pagedResponseSort.setDirection( sortDto.getDirection() );

        return pagedResponseSort;
    }

    protected IncomeList incomeDtoListToIncomeList(List<IncomeDto> list) {
        if ( list == null ) {
            return null;
        }

        IncomeList incomeList = new IncomeList();
        for ( IncomeDto incomeDto : list ) {
            incomeList.add( mapIncomeDtoToIncomeModel( incomeDto ) );
        }

        return incomeList;
    }

    protected CurrentUser userDtoToCurrentUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        CurrentUser currentUser = new CurrentUser();

        currentUser.setUserId( userDto.getUserId() );
        currentUser.setFirstName( userDto.getFirstName() );
        currentUser.setLastName( userDto.getLastName() );
        currentUser.setUsername( userDto.getUsername() );

        return currentUser;
    }
}
