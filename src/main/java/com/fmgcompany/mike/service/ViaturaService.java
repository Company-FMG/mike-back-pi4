package com.fmgcompany.mike.service;

import com.fmgcompany.mike.dto.ViaturaDTO;
import com.fmgcompany.mike.dto.ViaturaDTOMapper;
import com.fmgcompany.mike.model.Viatura;
import com.fmgcompany.mike.repository.ViaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ViaturaService {
    @Autowired
    private ViaturaRepository viaturaRepository;
    @Autowired
    private ViaturaDTOMapper viaturaDTOMapper;

    /*public List<Viatura> buscarViaturas(){
        return this.viaturaRepository.findAll();
    }

     */

    public List<ViaturaDTO> buscarViaturas(){
        return viaturaRepository.findAll().stream().map(viaturaDTOMapper).collect(Collectors.toList());
    }

    public Optional<Viatura> buscarViaturaId(UUID id){
        return this.viaturaRepository.findById(id);
    }

    public Viatura criarViatura(Viatura viatura){
        return viaturaRepository.save(viatura);
    }

    public void deletarViaturaId(UUID id){
        this.viaturaRepository.deleteById(id);
    }
}
