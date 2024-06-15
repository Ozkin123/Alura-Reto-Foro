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
    //@ManyToOne
    //@JoinColumn(name = "usuarios_id", referencedColumnName = "usuarios",insertable = false,nullable = false)
    //private UsuarioEntidad autor;
    //@ManyToOne
    //@JoinColumn(name = "topicos_id", referencedColumnName = "topicos",insertable = false,nullable = false)
    //private TopicoEntidad topico;


}
