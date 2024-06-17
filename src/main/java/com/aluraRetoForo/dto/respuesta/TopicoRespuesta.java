package com.aluraRetoForo.dto.respuesta;
import java.time.LocalDate;

public record TopicoRespuesta(
         String titulo,
         String mensaje,
         LocalDate fechaCreacion,
         boolean status,
         //String autor,
         String curso
) {
}
