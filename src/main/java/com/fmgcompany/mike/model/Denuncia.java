package com.fmgcompany.mike.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="denuncias")
public class Denuncia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //front: situação informada
    @Column
    protected String situacaoInformada;

    //front: localização (para localização)
    @Column
    protected String endereco;

    //front: (para localização)
    @Column
    protected String mapa;

    //front: vítima
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "vitima_id", referencedColumnName = "id")
    private Vitima vitima;

    @JsonBackReference
    @OneToMany
    private List<Suspeito> suspeitos;

    @Column
    protected String status;

    @Column
    protected String infoCena;


}
