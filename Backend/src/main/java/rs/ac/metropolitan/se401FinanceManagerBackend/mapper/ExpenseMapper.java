package rs.ac.metropolitan.se401FinanceManagerBackend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.Expense;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.User;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.*;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.*;


import java.util.List;
import java.util.Optional;

@Mapper

public interface ExpenseMapper {
    @ToCreateExpenseResponse
    @Mappings({
            @Mapping(source = "userDto", target = "user"),
            @Mapping(source = "categoryDto", target = "category")
    })
    CreateExpenseResponse mapCreatedExpenseDtoToResponse(ExpenseDto createdExpenseDto);

    UserDto mapUserToUserDto(User user);
    @Mappings({
            @Mapping(source = "userDto", target = "user"),
            @Mapping(source = "categoryDto", target = "category")
    })
    Expense mapExpenseDtoToExpense(ExpenseDto expenseDto);

    @Mappings({
            @Mapping(source = "userDto", target = "user"),
            @Mapping(source = "categoryDto", target = "category")
    })
    rs.ac.metropolitan.se401FinanceManagerBackend.model.Expense mapExpenseDtoToExpenseModel(ExpenseDto expenseDto);
    @Mappings({
            @Mapping(source = "category", target = "categoryDto")
    })
    ExpenseDto mapCreateExpenseRequestToExpenseDto(CreateExpenseRequest createExpenseRequest);

    @Mappings({
            @Mapping(source = "user", target = "userDto"),
            @Mapping(source = "category", target = "categoryDto")
    })
    ExpenseDto mapExpenseToExpenseDto(Expense byId);

    @ToGetExpenseById
    @Mappings({
            @Mapping(source = "userDto", target = "user"),
            @Mapping(source = "categoryDto", target = "category")
    })
    GetExpenseByIdResponse mapExpenseDtoToResponse(ExpenseDto expenseDtoByExpenseId);
    @Mappings({
            @Mapping(source = "category", target = "categoryDto")
    })
    ExpenseDto mapUpdateExpenseRequestToExpenseDto(UpdateExpenseRequest updateExpenseRequest);

    @ToUpdateExpenseResponse
    @Mappings({
            @Mapping(source = "userDto", target = "user"),
            @Mapping(source = "categoryDto", target = "category")
    })
    UpdateExpenseResponse mapUpdatedExpenseDtoToResponse(ExpenseDto updatedExpenseDto);

    List<ExpenseDto> mapExpensesListToExpenseDtosList(List<Expense> expenses);

    @Mappings({
            @Mapping(source = "number", target = "pageNumber"),
            @Mapping(source = "size", target = "pageSize"),
            @Mapping(source = "content", target = "expenseList"),
    })
    ExpensePageDto mapExpensesToExpensePageDto(Page<Expense> expenses);

    @Mappings({
            @Mapping(source = "first", target = "isFirst"),
            @Mapping(source = "last", target = "isLast"),
    })
    GetExpensesResponse mapExpensePageDtotoGetExpensesResponse(ExpensePageDto expensePageDto);

    default SortDto mapSort(Sort sort) {
        SortDto sortDto = new SortDto();
        Optional<Sort.Order> order = sort.get().findAny();
        if (order.isPresent()) {
            sortDto.setOrder(order.get().getProperty());
            sortDto.setDirection(order.get().getDirection().toString());
        }
        return sortDto;
    }
}
