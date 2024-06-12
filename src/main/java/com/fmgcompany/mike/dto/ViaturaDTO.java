package com.fmgcompany.mike.dto;

import java.util.List;
import java.util.UUID;

public record ViaturaDTO(UUID idViatura, String modelo, String marca, String placa, List<String> policiais) {
}
