package com.aluraRetoForo.infra.errores;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;

@RestControllerAdvice
public class TratadorErrores {


   @ExceptionHandler(EntityNotFoundException.class)
   public ResponseEntity error404(){
      return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity errorEntindadYaenDB(){
       return ResponseEntity.badRequest().body("Topico ya creado");
    }

}
