package com.aluraRetoForo.dto;

import java.time.LocalDateTime;

public record RespuestaDTO(
        String mensaje,
        LocalDateTime fechaCreacion,
        boolean solucion
) {
}
