package com.aluraRetoForo.repositorios;

import com.aluraRetoForo.entidades.RespuestaEntidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestaRepositorio extends JpaRepository<RespuestaEntidad,Long> {
}
