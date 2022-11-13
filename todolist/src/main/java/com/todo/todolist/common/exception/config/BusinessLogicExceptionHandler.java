package com.todo.todolist.common.exception.config;

import com.todo.todolist.common.exception.BusinessLogicException;
import com.todo.todolist.common.exception.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BusinessLogicExceptionHandler {
    @ExceptionHandler(BusinessLogicException.class)
    public ResponseEntity<?> handleCustomRuntimeException(BusinessLogicException ex) {
        ErrorResponseDto response = new ErrorResponseDto(ex.getExceptionCode());
        return new ResponseEntity<>(response, HttpStatus.valueOf(ex.getExceptionCode().getStatus()));
    }

}
