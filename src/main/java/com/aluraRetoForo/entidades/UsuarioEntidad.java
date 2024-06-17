package com.aluraRetoForo.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuarios")
public class UsuarioEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String contrasenia;
    @OneToMany(mappedBy = "autor")
    private List<TopicoEntidad> topicos;
    @OneToMany(mappedBy = "usuarioEntidad")
    private List<RespuestaEntidad> respuestas;

}
