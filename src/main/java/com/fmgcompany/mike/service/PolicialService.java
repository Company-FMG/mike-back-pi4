package com.fmgcompany.mike.service;


import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.fmgcompany.mike.dto.PolicialDTO;
import com.fmgcompany.mike.dto.PolicialDTOMapper;
import com.fmgcompany.mike.model.Ocorrencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fmgcompany.mike.model.Policial;
import com.fmgcompany.mike.repository.PolicialRepository;

@Service
    public class PolicialService {


        @Autowired
        private PolicialRepository policialRepository;
        @Autowired
        private PolicialDTOMapper policialDTOMapper;

        public List<PolicialDTO> findAll() {
            return policialRepository.findAll().stream().map(policialDTOMapper).collect(Collectors.toList());
        }
        public Optional<Policial> findById(UUID id) {
            return policialRepository.findById(id);
        }
        public Optional<PolicialDTO> buscaDTO(UUID id) {
            return policialRepository.findById(id).map(policialDTOMapper);
        }

        public Policial save(Policial policial) {
            return policialRepository.save(policial);
        }

        public void deleteById(UUID id) {
            policialRepository.deleteById(id);
        }

        public boolean existsById(UUID id) {
            return policialRepository.existsById(id);
        }

        public List<String> findByEmail() {
            return policialRepository.findByEmail();
        }

        public Policial findByNome(String nome) {
            return this.policialRepository.findByNome(nome);
        }


    }
