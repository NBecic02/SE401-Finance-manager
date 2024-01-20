package rs.ac.metropolitan.se401FinanceManagerBackend.exceptions;

public class ExpenseNotFoundException extends RuntimeException{
    public ExpenseNotFoundException(String message) {
        super(message);
    }
}
