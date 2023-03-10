package es.rf.tienda.exception;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.persistence.EntityNotFoundException;

//Order(Ordered.HIGHEST_PRECEDENCE)
//ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
  
   //other exception handlers
  
   //ExceptionHandler(EntityNotFoundException.class)
   protected ResponseEntity<Object> handleEntityNotFound(
           EntityNotFoundException ex) {
       ApiError apiError = new ApiError(HttpStatus.NOT_FOUND);
       apiError.setMessage(ex.getMessage());
       return buildResponseEntity(apiError);
   }
   
   //ExceptionHandler(DomainException.class)
   protected ResponseEntity<Object> domainException(
           EntityNotFoundException ex) {
       ApiError apiError = new ApiError(HttpStatus.NOT_FOUND);
       apiError.setMessage(ex.getMessage());
       return buildResponseEntity(apiError);
   }
   
   private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
       return new ResponseEntity<>(apiError, apiError.getStatus());
   }
}
