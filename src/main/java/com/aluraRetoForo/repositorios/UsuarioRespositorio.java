package com.aluraRetoForo.repositorios;

import com.aluraRetoForo.entidades.UsuarioEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRespositorio extends JpaRepository<UsuarioEntidad,Long> {
    UserDetails findByNombre(String username);
}
