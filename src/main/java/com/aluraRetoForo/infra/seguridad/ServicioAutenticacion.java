package com.aluraRetoForo.infra.seguridad;

import com.aluraRetoForo.entidades.UsuarioEntidad;
import com.aluraRetoForo.repositorios.UsuarioRespositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ServicioAutenticacion implements UserDetailsService {

    @Autowired
    private UsuarioRespositorio usuarioRespositorio;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usuarioRespositorio.findByNombre(username);
    }
}
