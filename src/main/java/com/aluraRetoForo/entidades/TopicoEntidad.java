package com.aluraRetoForo.entidades;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "topicos")
public class TopicoEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion;
    private boolean status;
    //@OneToMany(mappedBy = "RespuestaEntidad")
    //private List<RespuestaEntidad> respuestasEntidades;
    //@ManyToOne
    //@JoinColumn(name = "usuarios_id",referencedColumnName = "usuarios",nullable = false,insertable = false)
    //private UsuarioEntidad usuarios;
}
