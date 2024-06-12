package com.fmgcompany.mike.dto;

import com.fmgcompany.mike.model.Pessoa;
import com.fmgcompany.mike.model.Viatura;
import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ViaturaDTOMapper implements Function<Viatura,ViaturaDTO> {

    @Override
    public ViaturaDTO apply(Viatura viatura) {
        return new ViaturaDTO(
                viatura.getIdViatura(),
                viatura.getModelo(),
                viatura.getMarca(),
                viatura.getPlaca(),
                viatura.getPoliciais().stream().map(Pessoa::getNome).collect(Collectors.toList())
        );
    }
}
