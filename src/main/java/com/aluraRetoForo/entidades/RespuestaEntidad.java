package com.aluraRetoForo.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "respuestas")
public class RespuestaEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;
    private LocalDate fechaCreacion;
    private boolean solucion;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "topicos")
    private TopicoEntidad topicoEntidad;
    @ManyToOne
    @JoinColumn(name = "usuarios")
    private UsuarioEntidad usuarioEntidad;



}
