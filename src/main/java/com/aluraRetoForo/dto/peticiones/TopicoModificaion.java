package com.aluraRetoForo.dto.peticiones;

import jakarta.validation.constraints.NotBlank;

public record TopicoModificaion(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje
) {
}
