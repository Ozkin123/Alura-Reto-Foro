package com.aluraRetoForo.entidades;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "topicos")
public class TopicoEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    @Column(unique = true)
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
