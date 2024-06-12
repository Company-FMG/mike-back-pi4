package com.fmgcompany.mike.dto;

import com.fmgcompany.mike.model.Ocorrencia;
import com.fmgcompany.mike.model.Policial;
import com.fmgcompany.mike.model.Viatura;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class PolicialDTOMapper implements Function<Policial,PolicialDTO> {
    @Override
    public PolicialDTO apply(Policial policial) {
        Viatura v = policial.getViatura();
        String idViatura;
        if(v == null){
            idViatura = "null";
        }else{
            idViatura = policial.getViatura().getIdViatura().toString();
        }
        return new PolicialDTO(
                policial.getCpf(),
                policial.getNome(),
                policial.getEmail(),
                policial.getIdade(),
                policial.getSexo(),
                policial.getCargo(),
                idViatura,
                policial.getOcorrencias().stream().map(Ocorrencia::getIdOcorrencia).collect(Collectors.toList())
        );
    }
}
