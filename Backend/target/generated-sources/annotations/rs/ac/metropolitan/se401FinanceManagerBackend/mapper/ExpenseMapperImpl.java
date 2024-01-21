package rs.ac.metropolitan.se401FinanceManagerBackend.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.data.domain.Page;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.Expense;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.User;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.CategoryDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.ExpenseDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.ExpensePageDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.SortDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.UserDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.Category;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.CreateExpenseRequest;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.CreateExpenseResponse;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.CurrentUser;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.ExpenseList;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.GetExpenseByIdResponse;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.GetExpensesResponse;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.PagedResponseSort;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.UpdateExpenseRequest;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.UpdateExpenseResponse;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-21T06:37:32+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
public class ExpenseMapperImpl implements ExpenseMapper {

    @Override
    public CreateExpenseResponse mapCreatedExpenseDtoToResponse(ExpenseDto createdExpenseDto) {
        if ( createdExpenseDto == null ) {
            return null;
        }

        CreateExpenseResponse createExpenseResponse = new CreateExpenseResponse();

        createExpenseResponse.setUser( userDtoToCurrentUser( createdExpenseDto.getUserDto() ) );
        createExpenseResponse.setCategory( categoryDtoToCategory( createdExpenseDto.getCategoryDto() ) );
        createExpenseResponse.setExpenseId( createdExpenseDto.getExpenseId() );
        createExpenseResponse.setDate( createdExpenseDto.getDate() );
        createExpenseResponse.setShop( createdExpenseDto.getShop() );
        createExpenseResponse.setCost( createdExpenseDto.getCost() );

        return createExpenseResponse;
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
    public Expense mapExpenseDtoToExpense(ExpenseDto expenseDto) {
        if ( expenseDto == null ) {
            return null;
        }

        Expense expense = new Expense();

        expense.setUser( userDtoToUser( expenseDto.getUserDto() ) );
        expense.setCategory( categoryDtoToCategory1( expenseDto.getCategoryDto() ) );
        expense.setExpenseId( expenseDto.getExpenseId() );
        expense.setDate( expenseDto.getDate() );
        expense.setShop( expenseDto.getShop() );
        expense.setCost( expenseDto.getCost() );

        return expense;
    }

    @Override
    public rs.ac.metropolitan.se401FinanceManagerBackend.model.Expense mapExpenseDtoToExpenseModel(ExpenseDto expenseDto) {
        if ( expenseDto == null ) {
            return null;
        }

        rs.ac.metropolitan.se401FinanceManagerBackend.model.Expense expense = new rs.ac.metropolitan.se401FinanceManagerBackend.model.Expense();

        expense.setUser( userDtoToCurrentUser( expenseDto.getUserDto() ) );
        expense.setCategory( categoryDtoToCategory( expenseDto.getCategoryDto() ) );
        expense.setExpenseId( expenseDto.getExpenseId() );
        expense.setDate( expenseDto.getDate() );
        expense.setShop( expenseDto.getShop() );
        expense.setCost( expenseDto.getCost() );

        return expense;
    }

    @Override
    public ExpenseDto mapCreateExpenseRequestToExpenseDto(CreateExpenseRequest createExpenseRequest) {
        if ( createExpenseRequest == null ) {
            return null;
        }

        ExpenseDto expenseDto = new ExpenseDto();

        expenseDto.setCategoryDto( categoryToCategoryDto( createExpenseRequest.getCategory() ) );
        expenseDto.setDate( createExpenseRequest.getDate() );
        expenseDto.setShop( createExpenseRequest.getShop() );
        expenseDto.setCost( createExpenseRequest.getCost() );

        return expenseDto;
    }

    @Override
    public ExpenseDto mapExpenseToExpenseDto(Expense byId) {
        if ( byId == null ) {
            return null;
        }

        ExpenseDto expenseDto = new ExpenseDto();

        expenseDto.setUserDto( mapUserToUserDto( byId.getUser() ) );
        expenseDto.setCategoryDto( categoryToCategoryDto1( byId.getCategory() ) );
        expenseDto.setExpenseId( byId.getExpenseId() );
        expenseDto.setDate( byId.getDate() );
        expenseDto.setShop( byId.getShop() );
        expenseDto.setCost( byId.getCost() );

        return expenseDto;
    }

    @Override
    public GetExpenseByIdResponse mapExpenseDtoToResponse(ExpenseDto expenseDtoByExpenseId) {
        if ( expenseDtoByExpenseId == null ) {
            return null;
        }

        GetExpenseByIdResponse getExpenseByIdResponse = new GetExpenseByIdResponse();

        getExpenseByIdResponse.setUser( userDtoToCurrentUser( expenseDtoByExpenseId.getUserDto() ) );
        getExpenseByIdResponse.setCategory( categoryDtoToCategory( expenseDtoByExpenseId.getCategoryDto() ) );
        getExpenseByIdResponse.setExpenseId( expenseDtoByExpenseId.getExpenseId() );
        getExpenseByIdResponse.setDate( expenseDtoByExpenseId.getDate() );
        getExpenseByIdResponse.setShop( expenseDtoByExpenseId.getShop() );
        getExpenseByIdResponse.setCost( expenseDtoByExpenseId.getCost() );

        return getExpenseByIdResponse;
    }

    @Override
    public ExpenseDto mapUpdateExpenseRequestToExpenseDto(UpdateExpenseRequest updateExpenseRequest) {
        if ( updateExpenseRequest == null ) {
            return null;
        }

        ExpenseDto expenseDto = new ExpenseDto();

        expenseDto.setCategoryDto( categoryToCategoryDto( updateExpenseRequest.getCategory() ) );
        expenseDto.setDate( updateExpenseRequest.getDate() );
        expenseDto.setShop( updateExpenseRequest.getShop() );
        expenseDto.setCost( updateExpenseRequest.getCost() );

        return expenseDto;
    }

    @Override
    public UpdateExpenseResponse mapUpdatedExpenseDtoToResponse(ExpenseDto updatedExpenseDto) {
        if ( updatedExpenseDto == null ) {
            return null;
        }

        UpdateExpenseResponse updateExpenseResponse = new UpdateExpenseResponse();

        updateExpenseResponse.setUser( userDtoToCurrentUser( updatedExpenseDto.getUserDto() ) );
        updateExpenseResponse.setCategory( categoryDtoToCategory( updatedExpenseDto.getCategoryDto() ) );
        updateExpenseResponse.setExpenseId( updatedExpenseDto.getExpenseId() );
        updateExpenseResponse.setDate( updatedExpenseDto.getDate() );
        updateExpenseResponse.setShop( updatedExpenseDto.getShop() );
        updateExpenseResponse.setCost( updatedExpenseDto.getCost() );

        return updateExpenseResponse;
    }

    @Override
    public List<ExpenseDto> mapExpensesListToExpenseDtosList(List<Expense> expenses) {
        if ( expenses == null ) {
            return null;
        }

        List<ExpenseDto> list = new ArrayList<ExpenseDto>( expenses.size() );
        for ( Expense expense : expenses ) {
            list.add( mapExpenseToExpenseDto( expense ) );
        }

        return list;
    }

    @Override
    public ExpensePageDto mapExpensesToExpensePageDto(Page<Expense> expenses) {
        if ( expenses == null ) {
            return null;
        }

        ExpensePageDto expensePageDto = new ExpensePageDto();

        expensePageDto.setPageNumber( expenses.getNumber() );
        expensePageDto.setPageSize( expenses.getSize() );
        if ( expenses.hasContent() ) {
            expensePageDto.setExpenseList( mapExpensesListToExpenseDtosList( expenses.getContent() ) );
        }
        expensePageDto.setTotalPages( expenses.getTotalPages() );
        expensePageDto.setTotalElements( (int) expenses.getTotalElements() );
        expensePageDto.setFirst( expenses.isFirst() );
        expensePageDto.setLast( expenses.isLast() );
        expensePageDto.setSort( mapSort( expenses.getSort() ) );

        return expensePageDto;
    }

    @Override
    public GetExpensesResponse mapExpensePageDtotoGetExpensesResponse(ExpensePageDto expensePageDto) {
        if ( expensePageDto == null ) {
            return null;
        }

        GetExpensesResponse getExpensesResponse = new GetExpensesResponse();

        getExpensesResponse.setIsFirst( expensePageDto.isFirst() );
        getExpensesResponse.setIsLast( expensePageDto.isLast() );
        getExpensesResponse.setTotalPages( expensePageDto.getTotalPages() );
        getExpensesResponse.setTotalElements( expensePageDto.getTotalElements() );
        getExpensesResponse.setPageSize( expensePageDto.getPageSize() );
        getExpensesResponse.setPageNumber( expensePageDto.getPageNumber() );
        getExpensesResponse.setSort( sortDtoToPagedResponseSort( expensePageDto.getSort() ) );
        getExpensesResponse.setExpenseList( expenseDtoListToExpenseList( expensePageDto.getExpenseList() ) );

        return getExpensesResponse;
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

    protected Category categoryDtoToCategory(CategoryDto categoryDto) {
        if ( categoryDto == null ) {
            return null;
        }

        Category category = new Category();

        category.setCategoryId( categoryDto.getCategoryId() );
        category.setCategoryName( categoryDto.getCategoryName() );
        category.setCategoryDescription( categoryDto.getCategoryDescription() );

        return category;
    }

    protected User userDtoToUser(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setUserId( userDto.getUserId() );
        user.setFirstName( userDto.getFirstName() );
        user.setLastName( userDto.getLastName() );
        user.setUsername( userDto.getUsername() );
        user.setPassword( userDto.getPassword() );

        return user;
    }

    protected rs.ac.metropolitan.se401FinanceManagerBackend.domain.Category categoryDtoToCategory1(CategoryDto categoryDto) {
        if ( categoryDto == null ) {
            return null;
        }

        rs.ac.metropolitan.se401FinanceManagerBackend.domain.Category category = new rs.ac.metropolitan.se401FinanceManagerBackend.domain.Category();

        category.setCategoryId( categoryDto.getCategoryId() );
        category.setCategoryName( categoryDto.getCategoryName() );
        category.setCategoryDescription( categoryDto.getCategoryDescription() );

        return category;
    }

    protected CategoryDto categoryToCategoryDto(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setCategoryId( category.getCategoryId() );
        categoryDto.setCategoryName( category.getCategoryName() );
        categoryDto.setCategoryDescription( category.getCategoryDescription() );

        return categoryDto;
    }

    protected CategoryDto categoryToCategoryDto1(rs.ac.metropolitan.se401FinanceManagerBackend.domain.Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setCategoryId( category.getCategoryId() );
        categoryDto.setCategoryName( category.getCategoryName() );
        categoryDto.setCategoryDescription( category.getCategoryDescription() );

        return categoryDto;
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

    protected ExpenseList expenseDtoListToExpenseList(List<ExpenseDto> list) {
        if ( list == null ) {
            return null;
        }

        ExpenseList expenseList = new ExpenseList();
        for ( ExpenseDto expenseDto : list ) {
            expenseList.add( mapExpenseDtoToExpenseModel( expenseDto ) );
        }

        return expenseList;
    }
}
