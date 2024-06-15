package com.aluraRetoForo.repositorios;

import com.aluraRetoForo.entidades.UsuarioEntidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRespositorio extends JpaRepository<UsuarioEntidad,Long> {
}
