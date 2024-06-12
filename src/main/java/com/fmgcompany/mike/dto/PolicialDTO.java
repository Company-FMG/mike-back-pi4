package com.fmgcompany.mike.dto;
import java.util.List;
public record PolicialDTO (String cpf, String nome, String email, int idade,String sexo, String cargo, String idViatura,List<String> idOcorrencias){
}
