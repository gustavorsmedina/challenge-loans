package tech.gustavomedina.loans.handler;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import tech.gustavomedina.loans.dto.ExceptionResponse;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, HttpServletRequest request){

        Map<String, String> params = new HashMap<>();
        ex.getBindingResult()
                .getFieldErrors()
                .forEach((e) -> params.put(e.getField(), e.getDefaultMessage()));

        var message = "All parameters must be valid.";
        var status = HttpStatus.BAD_REQUEST;
        var response = ExceptionResponse.builder()
                .date(LocalDateTime.now())
                .status(status.getReasonPhrase())
                .message(message)
                .path(request.getRequestURI())
                .params(params)
                .build();

        return ResponseEntity.status(status).body(response);
    }

}
