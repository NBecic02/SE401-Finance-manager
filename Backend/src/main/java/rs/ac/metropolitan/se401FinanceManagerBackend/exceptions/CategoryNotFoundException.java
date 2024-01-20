package rs.ac.metropolitan.se401FinanceManagerBackend.exceptions;

public class CategoryNotFoundException extends RuntimeException{
    public CategoryNotFoundException(String message) {
        super(message);
    }
}

