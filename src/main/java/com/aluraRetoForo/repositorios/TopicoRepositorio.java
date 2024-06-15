package com.aluraRetoForo.repositorios;

import com.aluraRetoForo.entidades.TopicoEntidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepositorio extends JpaRepository<TopicoEntidad,Long> {
}
