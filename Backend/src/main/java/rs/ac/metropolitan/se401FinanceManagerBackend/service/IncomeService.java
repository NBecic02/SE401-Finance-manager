package rs.ac.metropolitan.se401FinanceManagerBackend.service;


import rs.ac.metropolitan.se401FinanceManagerBackend.dto.IncomeDto;
import rs.ac.metropolitan.se401FinanceManagerBackend.dto.IncomePageDto;

public interface IncomeService {
    IncomePageDto getIncomes(String username, Integer pageNumber, Integer pageSize, String sort);

    IncomePageDto getIncomesBySource(String username, Integer pageNumber, Integer pageSize, String sort, String shop);
    IncomeDto getIncomeDtoByIncomeId(Integer incomeId, String username);
    IncomeDto saveIncome(IncomeDto incomeDto, String username);
    IncomeDto updateIncome(Integer incomeId, IncomeDto incomeDto);
    void deleteIncomeById(Integer incomeId);
}
