package com.fmgcompany.mike.dto;
import java.util.List;
import java.util.UUID;

public record PolicialDTO (UUID id, String cpf, String nome, String email, int idade, String sexo, String cargo, String idViatura, List<String> idOcorrencias){
}
