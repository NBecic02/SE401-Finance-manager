package rs.ac.metropolitan.se401FinanceManagerBackend.service.impl;

import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.Expense;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.User;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.ExpenseDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.ExpensePageDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.exceptions.ExpenseNotFoundException;
import rs.ac.metropolitan.se401FinanceManagerBackend.mapper.ExpenseMapper;
import rs.ac.metropolitan.se401FinanceManagerBackend.repository.ExpenseRepository;
import rs.ac.metropolitan.se401FinanceManagerBackend.repository.UserRepository;
import rs.ac.metropolitan.se401FinanceManagerBackend.service.CategoryService;
import rs.ac.metropolitan.se401FinanceManagerBackend.service.ExpenseService;
import rs.ac.metropolitan.se401FinanceManagerBackend.service.UserService;


@Service
@RequiredArgsConstructor
@Transactional
public class ExpenseServiceImpl implements ExpenseService {
    private static final ExpenseMapper MAPPER = Mappers.getMapper((ExpenseMapper.class));
    private final ExpenseRepository expenseRepository;
    private final UserService userService;
    private final UserRepository userRepository;
    private final CategoryService categoryService;
    @Override
    public ExpensePageDto getExpenses(String username, Integer pageNumber, Integer pageSize, String sort) {
        Sort.Direction sortDirection = sort.startsWith("-") ? Sort.Direction.DESC : Sort.Direction.ASC;
        if(sort.startsWith("-"))
            sort = sort.substring(1);
        Pageable pageable = PageRequest.of(pageNumber, pageSize, sortDirection, sort);
        userRepository.findUserByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User with username: " + username + " not found!!!"));
        Page<Expense> expenses = expenseRepository.findAllByUser_Username(pageable, username);
        return MAPPER.mapExpensesToExpensePageDto(expenses);
    }

    @Override
    public ExpensePageDto getExpensesByShop(String username, Integer pageNumber, Integer pageSize, String sort, String shop) {
        Sort.Direction sortDirection = sort.startsWith("-") ? Sort.Direction.DESC : Sort.Direction.ASC;
        if(sort.startsWith("-"))
            sort = sort.substring(1);
        Pageable pageable = PageRequest.of(pageNumber, pageSize, sortDirection, sort);
        userRepository.findUserByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User with username: " + username + " not found!!!"));
        Page<Expense> expenses = expenseRepository.findAllByUser_UsernameAndShop(pageable, username, shop);
        return MAPPER.mapExpensesToExpensePageDto(expenses);
    }

    @Override
    public ExpenseDto getExpenseDtoByExpenseId(Integer expenseId, String username) {
        userRepository.findUserByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User with username: " + username + " not found!!!"));
        Expense expense = expenseRepository.findByExpenseIdAndUser_Username(expenseId, username)
                .orElseThrow(() -> new ExpenseNotFoundException("Expense with ID: " + expenseId + " doesn't exist!"));
        return MAPPER.mapExpenseToExpenseDto(expense);
    }

    @Override
    public ExpenseDto saveExpense(ExpenseDto expenseDto, String username) {
        Expense expense = MAPPER.mapExpenseDtoToExpense(expenseDto);
        User user = userService.findUserByUsername(username);
        expense.setUser(user);
        Expense createdExpense = expenseRepository.save(expense);
        ExpenseDto createdExpenseDto = MAPPER.mapExpenseToExpenseDto(createdExpense);
        createdExpenseDto.setUserDto(MAPPER.mapUserToUserDto(user));
        return createdExpenseDto;
    }

    @Override
    public ExpenseDto updateExpense(Integer expenseId, ExpenseDto expenseDto) {
        Expense expense = expenseRepository.findById(expenseId)
                .orElseThrow(() -> new ExpenseNotFoundException("Expense with ID: " + expenseId + " doesn't exist!"));
        User user = expense.getUser();
        expense = MAPPER.mapExpenseDtoToExpense(expenseDto);
        expense.setExpenseId(expenseId);
        expense.setUser(user);
        Expense createdExpense = expenseRepository.save(expense);
        return MAPPER.mapExpenseToExpenseDto(createdExpense);
    }

    @Override
    public void deleteExpenseById(Integer expenseId) {
        expenseRepository.deleteById(expenseId);
    }
}
