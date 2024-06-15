package com.aluraRetoForo.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

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
    private LocalDateTime fechaCreacion;
    @ManyToOne
    @JoinColumn(name = "topicos")
    private TopicoEntidad topicoEntidad;
    @ManyToOne
    @JoinColumn(name = "usuarios")
    private UsuarioEntidad usuarioEntidad;



}
