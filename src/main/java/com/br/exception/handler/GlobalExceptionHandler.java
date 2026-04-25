package com.br.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import com.br.exception.custom.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    //  404
    @ExceptionHandler(RecursoNaoEncontrado.class)
    public ResponseEntity<Map<String, Object>> handleNotFound(RecursoNaoEncontrado ex) {
        return buildResponse(HttpStatus.NOT_FOUND, ex.getMessage());
    }

    // 400
    @ExceptionHandler(RegraNegocio.class)
    public ResponseEntity<Map<String, Object>> handleBusiness(RegraNegocio ex) {
        return buildResponse(HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    // 401
    @ExceptionHandler(ErroAutenticacao.class)
    public ResponseEntity<Map<String, Object>> handleAuth(ErroAutenticacao ex) {
        return buildResponse(HttpStatus.UNAUTHORIZED, ex.getMessage());
    }

    //  500
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGeneral(Exception ex) {
    ex.printStackTrace(); 
    return buildResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Erro interno no servidor");
    }

    // PADRÃO DE RESPOSTA
    private ResponseEntity<Map<String, Object>> buildResponse(HttpStatus status, String mensagem) {
        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("status", status.value());
        body.put("erro", status.getReasonPhrase());
        body.put("mensagem", mensagem);
        return ResponseEntity.status(status).body(body);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
        public ResponseEntity<Map<String, String>> handleValidation(MethodArgumentNotValidException ex) {
         Map<String, String> erros = new HashMap<>();
         ex.getBindingResult().getFieldErrors().forEach(error -> {
                erros.put(error.getField(), error.getDefaultMessage());
         });

        return ResponseEntity.badRequest().body(erros);
        }
}