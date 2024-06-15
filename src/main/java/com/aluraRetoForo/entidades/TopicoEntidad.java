package com.aluraRetoForo.entidades;

import com.aluraRetoForo.dto.RespuestaDTO;

import java.time.LocalDateTime;

public class TopicoEntidad {
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion;
    private boolean status;
    private Respuesta respuesta;
}
