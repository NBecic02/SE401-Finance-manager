package rs.ac.metropolitan.se401FinanceManagerBackend.service;


import rs.ac.metropolitan.se401FinanceManagerBackend.dto.ExpenseDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.ExpensePageDto;

public interface ExpenseService {
    ExpensePageDto getExpenses(String username, Integer pageNumber, Integer pageSize, String sort);
    ExpensePageDto getExpensesByShop(String username, Integer pageNumber, Integer pageSize, String sort, String shop);
    ExpenseDto getExpenseDtoByExpenseId(Integer expenseId, String username);
    ExpenseDto saveExpense(ExpenseDto expense, String username);
    ExpenseDto updateExpense(Integer expenseId, ExpenseDto expenseDto);
    void deleteExpenseById(Integer expenseId);
}
