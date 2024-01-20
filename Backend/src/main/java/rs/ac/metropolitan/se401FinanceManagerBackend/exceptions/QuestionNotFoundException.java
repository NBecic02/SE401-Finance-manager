package rs.ac.metropolitan.se401FinanceManagerBackend.exceptions;

public class QuestionNotFoundException extends RuntimeException{
    public QuestionNotFoundException(String message) {
        super(message);
    }
}
