package com.aluraRetoForo.entidades;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Data
@Table(name = "topicos")
public class TopicoEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String titulo;
    @Column(unique = true, nullable = false)
    private String mensaje;
    private LocalDate fechaCreacion;
    private boolean status;
    private String curso;
    @ManyToOne
    @JoinColumn(name = "usuarios")
    private UsuarioEntidad autor;
    @OneToMany(mappedBy = "topicoEntidad")
    private List<RespuestaEntidad> respuestas;
}
