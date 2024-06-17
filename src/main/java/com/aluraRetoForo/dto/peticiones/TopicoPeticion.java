package com.aluraRetoForo.dto.peticiones;

import jakarta.validation.constraints.NotBlank;

public record TopicoPeticion(
        @NotBlank String titulo,
        @NotBlank String mensaje,

        @NotBlank String autor,
        @NotBlank String curso
) {
}
