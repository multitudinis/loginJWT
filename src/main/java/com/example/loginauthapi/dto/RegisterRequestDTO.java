package com.example.loginauthapi.dto;
import java.util.Date;

public record RegisterRequestDTO (
    String name,
    String email,
    String password,
    String cpf,
    String telefone,
    Date dataNascimento
    
    ) {
}
