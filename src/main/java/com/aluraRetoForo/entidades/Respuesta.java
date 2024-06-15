package com.aluraRetoForo.entidades;

import java.time.LocalDateTime;

public class Respuesta {
    private Long id;
    private String mensaje;
    private TopicoEntidad topico;
    private LocalDateTime fechaCreacion;
    private UsuarioEntidad autor;

}
