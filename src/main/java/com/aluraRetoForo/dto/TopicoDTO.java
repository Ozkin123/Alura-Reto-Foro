package com.aluraRetoForo.dto;

import java.time.LocalDateTime;

public record TopicoDTO(
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        boolean status,
        AutorDTO autor,
        RespuestaDTO respuesta
) {
}
