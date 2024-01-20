package rs.ac.metropolitan.se401FinanceManagerBackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import rs.ac.metropolitan.se401FinanceManagerBackend.exceptions.ExpenseNotFoundException;
import rs.ac.metropolitan.se401FinanceManagerBackend.exceptions.IncomeNotFoundException;
import rs.ac.metropolitan.se401FinanceManagerBackend.exceptions.UsernameAlreadyExistsException;
import rs.ac.metropolitan.se401FinanceManagerBackend.model.ErrorResponse;

@ControllerAdvice
@RequiredArgsConstructor
public class ExceptionController {

    @ExceptionHandler({ UsernameAlreadyExistsException.class })
    public final ResponseEntity<ErrorResponse> handleException(UsernameAlreadyExistsException ex, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setCode(4000);
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({ ExpenseNotFoundException.class })
    public final ResponseEntity<ErrorResponse> handleException(ExpenseNotFoundException ex, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setCode(4000);
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({ IncomeNotFoundException.class })
    public final ResponseEntity<ErrorResponse> handleException(IncomeNotFoundException ex, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(ex.getMessage());
        errorResponse.setCode(4000);
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }
}
